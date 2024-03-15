package LW2;

public class Task2 {
    public static void main(String[] args) {
        // Размеры массива
        int rows = 5;
        int columns = 5;

        // Создание и заполнение массива "змейкой"
        int[][] array = fillSnakeArray(rows, columns);

        // Вывод массива в консоль
        displayArray(array);
    }

    // Метод для заполнения массива "змейкой"
    public static int[][] fillSnakeArray(int rows, int columns) {
        int[][] array = new int[rows][columns];
        int value = 1; // Начальное значение для заполнения

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) { // Нечетные строки (слева направо)
                for (int j = 0; j < columns; j++) {
                    array[i][j] = value;
                    value++;
                }
            } else { // Четные строки (справа налево)
                for (int j = columns - 1; j >= 0; j--) {
                    array[i][j] = value;
                    value++;
                }
            }
        }

        return array;
    }

    // Метод для отображения массива в консольном окне
    public static void displayArray(int[][] array) {
        System.out.println("Двумерный массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
