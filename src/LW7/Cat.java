package LW7;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{name='" + name + "', age=" + age + "}";
    }
}
