package LW2.Shape;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты для каждой фигуры
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 4, 5);

        // Вычисляем площадь и периметр каждой фигуры и выводим результаты
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Периметр круга: " + circle.calculatePerimeter());

        System.out.println("Площадь квадрата: " + square.calculateArea());
        System.out.println("Периметр квадрата: " + square.calculatePerimeter());

        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
    }
}
