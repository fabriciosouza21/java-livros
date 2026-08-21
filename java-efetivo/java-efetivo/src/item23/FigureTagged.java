package item23;

public class FigureTagged {

    enum Shape { RECTANGLE, CIRCLE }


    final Shape shape;

    // tagged class - only represents a rectangle
    final double length;
    final double width;

    // tagged class - only represents a circle
    final double radius;


    // constructor for rectangle
    FigureTagged(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
        this.radius = 0;
    }

    // constructor for circle
    FigureTagged(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
        this.length = 0;
        this.width = 0;
    }

    double area() {
        return switch (shape) {
            case RECTANGLE ->  length * width;
            case CIRCLE -> Math.PI * radius * radius;
            default -> throw new AssertionError(shape);
        };
    }

}
