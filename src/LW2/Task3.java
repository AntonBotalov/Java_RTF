package LW2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        System.out.println("Введите ключ (сдвиг):");
        int key = scanner.nextInt();

        // Зашифрование текста, обращаемся к классу Encrypt
        String encryptedText = Encrypt.getEncryptString(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        scanner.nextLine();
        String response = scanner.nextLine();

        // Если пользователь вводит «y», тогда выполнить обратное преобразование.
        if (response.equalsIgnoreCase("y")) {
            // Расшифрование текста, обращаемся к классу Encrypt
            String decryptedText = Encrypt.getDecryptString(encryptedText, key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);

        // Если пользователь вводит «n», того программа выводит сообщение «До свидания!».
        } else if (response.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        // Если пользователь вводит что-то другое, отличное от «y» или «n»,
        // то программа ему выводит сообщение: «Введите корректный ответ».
        } else {
            System.out.println("Введите корректный ответ");
        }

        scanner.close();
    }
}

