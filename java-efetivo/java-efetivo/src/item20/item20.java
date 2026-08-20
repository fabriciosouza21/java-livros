package item20;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class item20 {

    static void main() {

        IO.println("Prefer interfaces to abstract classes");


        int[] a = {10, 20, 30};
        List<Integer> lista = intArrayAsList(a);
        lista.set(0, 100);
        // a[0] is now 100
        // por que a lista é uma view do array, então quando você altera a lista, o array original também é alterado.
        // essa view é conhecido como o padrão Adapter, que é um padrão de projeto que permite que uma interface existente seja usada como outra interface.
        IO.println(a[0]);



    }

    static List<Integer> intArrayAsList(int[] a){
        Objects.requireNonNull(a);
        return new AbstractList<Integer> () {
            @Override
            public Integer get(int index) {
                return a[index];
            }

            @Override
            public Integer set(int index, Integer element) {
                int oldval = a[index];
                a[index] = element;
                return oldval;
            }

            @Override
            public int size() {
                return a.length;
            }
        };
    }

}

