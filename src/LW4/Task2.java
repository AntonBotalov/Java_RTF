package LW4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите количество строк матрицы: ");
            int rows = scanner.nextInt();

            System.out.print("Введите количество столбцов матрицы: ");
            int cols = scanner.nextInt();

            int[][] matrix = new int[rows][cols];

            System.out.println("Введите элементы матрицы:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            System.out.print("Введите номер столбца, который нужно вывести: ");
            int columnNumber = scanner.nextInt();

            if (columnNumber < 1 || columnNumber > cols) {
                throw new IllegalArgumentException("Нет столбца с таким номером");
            }

            System.out.println("Столбец с номером " + columnNumber + ":");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][columnNumber - 1]);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка ввода: введите целое число");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
