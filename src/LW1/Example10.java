package LW1;

import java.time.Year;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения: ");

        int birthYear = in.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.printf("Ваш возраст: %d лет\n", age);

        in.close();
    }
}
