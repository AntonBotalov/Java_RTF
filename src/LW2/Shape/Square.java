package LW2.Shape;

public class Square implements Shape{
    // Поле класса
    private double side;

    // Конструктор класса Square
    public Square(double side) {
        this.side = side;
    }

    // Реализация метода для вычисления площади квадрата
    @Override
    public double calculateArea() {
        return side * side;
    }

    // Реализация метода для вычисления периметра квадрата
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
