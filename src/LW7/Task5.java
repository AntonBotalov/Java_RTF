package LW7;

import java.io.File;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        String path = "untitled/src/LW7/";
        Scanner in = new Scanner(System.in);

        try {
            // Запрос имени файла у пользователя
            System.out.print("Введите название файла: ");
            String fileName = in.nextLine();
            String finalFileName = path + fileName;

            File file = new File(finalFileName);

            // Проверка, существует ли файл и является ли он файлом
            if (file.exists() && file.isFile()) {
                long fileSize = file.length();
                System.out.println("Размер файла " + fileName + " составляет " + fileSize + " байт.");
            } else {
                System.out.println("Файл не найден или это не файл.");
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            in.close();
        }
    }

}
