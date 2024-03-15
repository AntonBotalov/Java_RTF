package LW1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        int num1 = in.nextInt();

        System.out.println("Введите второе целое число: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;

        System.out.printf("Сумма чисел %d и %d равна: %d\n", num1, num2, sum);
        System.out.printf("Разность чисел %d и %d равна: %d\n", num1, num2, difference);

        in.close();
    }
}
