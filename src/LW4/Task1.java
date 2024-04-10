package LW4;

import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным числом");
            }

            int[] array = new int[size];
            int sum = 0;
            int count = 0;

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
                if (array[i] > 0) {
                    sum += array[i];
                    count++;
                }
            }

            if (count == 0) {
                throw new IllegalStateException("В массиве отсутствуют положительные элементы");
            }

            double average = (double) sum / count;
            System.out.println("Среднее значение среди положительных элементов: " + average);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка ввода: введите целое число");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
