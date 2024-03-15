package LW2.Animals;

public class Bird extends Animal {
    // Уникальное поле для способности летать
    private boolean canFly;

    // Конструктор класса Bird
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    // Переопределенный метод для издания звука
    @Override
    public void makeSound() {
        System.out.println("Птица чирикает");
    }

    // Геттер и сеттер для поля canFly
    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
