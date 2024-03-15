package LW2;

public class Rectangle {
    // Поля класса
    private double length;
    private double width;

    // Конструктор класса Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Метод для установки длины
    public void setLength(double length) {
        this.length = length;
    }

    // Метод для получения длины
    public double getLength() {
        return length;
    }

    // Метод для установки ширины
    public void setWidth(double width) {
        this.width = width;
    }

    // Метод для получения ширины
    public double getWidth() {
        return width;
    }

    // Метод для вычисления площади прямоугольника
    public double calculateArea() {
        return length * width;
    }

    // Метод для вычисления периметра прямоугольника
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
