package LW2.ShapeCl;

public class Triangle extends Shape {
    // Уникальные поля для сторон треугольника
    private double side1;
    private double side2;
    private double side3;

    // Конструктор класса Triangle
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Переопределение метода для вычисления площади треугольника
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Переопределение метода для вычисления периметра треугольника
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
