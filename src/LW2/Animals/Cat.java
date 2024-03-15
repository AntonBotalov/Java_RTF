package LW2.Animals;

public class Cat extends Animal {
    // Уникальное поле для типа корма
    private String foodType;

    // Конструктор класса Cat
    public Cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }

    // Переопределенный метод для издания звука
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает");
    }

    // Геттер и сеттер для поля foodType
    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}
