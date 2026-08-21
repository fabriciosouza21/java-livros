package item21;

import java.util.ArrayList;
import java.util.Collection;

public class item21 {

    static void main() {

        // method default if delete

        IO.println("Design interfaces for posterity");

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        /*
        * Remover if é um método default da interface collection
        * */
        integers.removeIf(integer -> integer % 2 == 0);

    }
}
