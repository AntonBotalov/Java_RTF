package LW2;

public class Person {
    // Поля класса
    private String name;
    private int age;
    private String gender;

    // Конструктор класса Person
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Метод для установки имени
    public void setName(String name) {
        this.name = name;
    }

    // Метод для получения имени
    public String getName() {
        return name;
    }

    // Метод для установки возраста
    public void setAge(int age) {
        this.age = age;
    }

    // Метод для получения возраста
    public int getAge() {
        return age;
    }

    // Метод для установки пола
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Метод для получения пола
    public String getGender() {
        return gender;
    }

    // Переопределение метода toString() для получения строкового представления объекта
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
