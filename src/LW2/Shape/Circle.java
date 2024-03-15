package LW2.Shape;

public class Circle implements Shape{
    // Поле класса
    private double radius;

    // Конструктор класса Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Реализация метода для вычисления площади круга
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Реализация метода для вычисления периметра круга
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
