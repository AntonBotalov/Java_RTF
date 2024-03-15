package LW2;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Создание объекта класса Scanner для считывания числа введённого к консоль
        Scanner id = new Scanner(System.in);
        // Сообщение пользователю "для красоты и понимания"
        System.out.println("Введите размер массива");
        // Запись в переменную Size (нужная для того чтобы задать размер массива)
        int size = id.nextInt();
        // Значения введенного в консоль
        System.out.println("Размер массива равен "+ size);

        // Создание массива
        int[] array = new int[size];

        // Заполнение массива случайными числами
        fillArray(array);

        // Отображение массива в консольном окне
        displayArray(array);

        // Поиск элемента(ов) с минимальным значением
        findMinElements(array);
    }

    // Метод для заполнения массива случайными числами
    public static void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Генерация случайного числа от 0 до 99
        }
    }

    // Метод для отображения массива в консольном окне
    public static void displayArray(int[] array) {
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Метод для поиска элемента(ов) с минимальным значением и их индексов
    public static void findMinElements(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Минимальное значение: " + min);
        System.out.print("Индекс(ы) минимального элемента: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}
