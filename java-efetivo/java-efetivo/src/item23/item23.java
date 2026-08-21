package item23;

public class item23 {
    static void main() {
        FigureTagged rectangle = new FigureTagged(5, 10);
        FigureTagged circle = new FigureTagged(7);

        IO.println("Rectangle area: " + rectangle.area());
        IO.println("Circle area: " + circle.area());

        Figure  rect = new Rectangle(5, 10);
        Figure  circ = new Circle(7);
        Figure square = new Square(5);

        IO.println("Rectangle area: " + rect.area());
        IO.println("Circle area: " + circ.area());
        IO.println("Square area: " + square.area());

    }
}
