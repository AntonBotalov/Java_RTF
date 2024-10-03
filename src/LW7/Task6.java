package LW7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        String path = "untitled/src/LW7/";
        Scanner in = new Scanner(System.in);

        try {
            // Запрос имени файла у пользователя
            System.out.print("Введите название файла: ");
            String fileName = in.nextLine();
            String finalFileName = path + fileName;
            File file = new File(finalFileName);

            // Проверка файла на существование
            if (file.exists() && file.isFile()) {
                Scanner fileScanner = new Scanner(file);
                int lineNumber = 1;
                // Запрос искомого слова
                System.out.print("Введите слово для поиска: ");
                String searchWord = in.nextLine();

                // Поиск и вывод строк, содержащих указанное слово
                System.out.println("Строки, содержащие слово \"" + searchWord + "\":");
                boolean wordFound = false;

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();

                    if (line.contains(searchWord)) {
                        System.out.println("Строка " + lineNumber + ": " + line);
                        wordFound = true;
                    }

                    lineNumber++;
                }

                if (!wordFound) {
                    System.out.println("Слово \"" + searchWord + "\" не найдено в файле.");
                }

                fileScanner.close();
            } else {
                System.out.println("Файл не найден или это не файл.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден.");
        } finally {
            in.close();
        }
    }
}
