package LW2.ShapeCl;

public class Square extends Shape {
    // Уникальное поле для длины стороны
    private double sideLength;

    // Конструктор класса Square
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // Переопределение метода для вычисления площади квадрата
    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    // Переопределение метода для вычисления периметра квадрата
    @Override
    public double calculatePerimeter() {
        return 4 * sideLength;
    }
}
