package LW1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();

        int num1 = num - 1;
        int num2 = num;
        int num3 = num + 1;
        int num4 = (num1 + num2 + num3) * (num1 + num2 + num3);

        System.out.printf("Последовательность чисел: %d, %d, %d, %d\n", num1, num2, num3, num4);

        in.close();
    }
}
