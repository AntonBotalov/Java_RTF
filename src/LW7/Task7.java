package LW7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) throws IOException {
        String path = "untitled/src/LW7/";
        Scanner in = new Scanner(System.in);
        System.out.print("Название файла для записи: ");
        String fileName = in.nextLine();
        System.out.print("Текст для записи в файл: ");
        String textToWrite = in.nextLine();
        String finalFileName = path + fileName;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(finalFileName))) {
            writer.write(textToWrite);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
            return;
        }
        System.out.println("Текст успешно записан в файл.");
        System.out.println("Количество записанных символов: " + textToWrite.length());
        in.close();
    }
}
