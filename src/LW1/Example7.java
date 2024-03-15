package LW1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Input age: ");
        int age = in.nextInt();

        System.out.printf("Имя: %s Возраст: %d\n", name, age);

        in.close();
    }
}
