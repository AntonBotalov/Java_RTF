package LW4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            byte[] array = new byte[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextByte();
            }

            // Вычисляем сумму элементов массива
            int sum = 0;
            for (byte num : array) {
                sum += num;
            }

            System.out.println("Сумма элементов массива: " + sum);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка ввода: введите целое число");
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Ошибка ввода: введите число, значение которого помещается в тип byte");
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Ошибка: превышено значение типа byte");
        } finally {
            scanner.close();
        }
    }
}
