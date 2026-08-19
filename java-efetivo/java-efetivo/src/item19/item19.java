package item19;

public class item19 {
    public static void main(String[] args) {
        IO.println("Item 19: Projete e documente as classes para herança o u a iniba");

        IO.println("Quebrado: Construtor chama método sobreponivel");

        Sub sub = new Sub();
        sub.overrideMe();

    }
}
