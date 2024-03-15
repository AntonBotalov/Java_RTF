package LW2.Animals;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты для каждого подкласса и вызываем их методы
        Dog dog = new Dog("Барсик", 5, "Далматин");
        System.out.println("Имя собаки: " + dog.getName());
        System.out.println("Возраст собаки: " + dog.getAge());
        System.out.println("Порода собаки: " + dog.getBreed());
        dog.makeSound();

        System.out.println();

        Cat cat = new Cat("Мурзик", 3, "Сухой корм");
        System.out.println("Имя кошки: " + cat.getName());
        System.out.println("Возраст кошки: " + cat.getAge());
        System.out.println("Тип корма кошки: " + cat.getFoodType());
        cat.makeSound();

        System.out.println();

        Bird bird = new Bird("Чижик", 2, true);
        System.out.println("Имя птицы: " + bird.getName());
        System.out.println("Возраст птицы: " + bird.getAge());
        System.out.println("Способность летать: " + (bird.isCanFly() ? "Да" : "Нет"));
        bird.makeSound();
    }
}
