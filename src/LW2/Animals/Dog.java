package LW2.Animals;

public class Dog extends Animal {
    // Уникальное поле для породы
    private String breed;

    // Конструктор класса Dog
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Переопределенный метод для издания звука
    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }

    // Геттер и сеттер для поля breed
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
