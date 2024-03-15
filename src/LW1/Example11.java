package LW1;

import java.time.Year;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите год рождения: ");

        int birthYear = in.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.printf("Привет, %s! Ваш возраст: %d лет.\n", name, age);

        in.close();
    }
}
