package LW2.ShapeCl;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты для каждого подкласса и вызываем их методы
        Circle circle = new Circle(5);
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Периметр круга: " + circle.calculatePerimeter());

        Square square = new Square(4);
        System.out.println("Площадь квадрата: " + square.calculateArea());
        System.out.println("Периметр квадрата: " + square.calculatePerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
    }
}
