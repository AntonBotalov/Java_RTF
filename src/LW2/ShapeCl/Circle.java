package LW2.ShapeCl;

public class Circle extends Shape{
    // Уникальное поле для радиуса
    private double radius;

    // Конструктор класса Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Переопределение метода для вычисления площади круга
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Переопределение метода для вычисления периметра круга
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
