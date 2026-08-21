package item23;

public sealed interface Figure permits Rectangle, Circle {
    double area();
}
