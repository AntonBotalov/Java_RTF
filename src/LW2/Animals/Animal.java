package LW2.Animals;

public class Animal {
    // Поля класса Animal
    private String name;
    private int age;

    // Конструктор класса Animal
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для издания звука
    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    // Геттеры и сеттеры для полей класса Animal
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
