package LW8.Task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class MyJsonParser {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("untitled/src/LW8/Task2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            boolean exit = false;
            while (!exit) {
                System.out.println("\nВыберите действие:");
                System.out.println("1 - Добавить книгу");
                System.out.println("2 - Найти книгу");
                System.out.println("3 - Удалить книгу");
                System.out.println("4 - Вывести все книги");
                System.out.println("5 - Выход");
                System.out.print("Введите номер действия: ");
                String choice = in.nextLine();

                switch (choice) {
                    case "1": // Добавить книгу
                        System.out.print("Введите название книги: ");
                        String nameBook = in.nextLine();
                        System.out.print("Введите имя автора: ");
                        String author = in.nextLine();
                        System.out.print("Введите год издания: ");
                        String year = in.nextLine();

                        JSONObject newBook = new JSONObject();
                        newBook.put("title", nameBook);
                        newBook.put("author", author);
                        newBook.put("year", year);

                        jsonArray.add(newBook);
                        jsonObject.put("books", jsonArray);

                        saveChanges(jsonObject);
                        System.out.println("Книга успешно добавлена!");
                        break;

                    case "2": // Найти книгу
                        System.out.print("Введите имя автора: ");
                        String searchAuthor = in.nextLine();
                        System.out.print("Введите год издания: ");
                        String searchYear = in.nextLine();

                        boolean found = false;
                        for (Object o : jsonArray) {
                            JSONObject book = (JSONObject) o;
                            if (book.get("author").equals(searchAuthor) && book.get("year").equals(searchYear)) {
                                System.out.println("Книга найдена: " + book.get("title"));
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("Книга не найдена.");
                        }
                        break;

                    case "3": // Удалить книгу
                        System.out.print("Введите название книги для удаления: ");
                        String titleBook = in.nextLine();

                        Iterator iterator = jsonArray.iterator();
                        boolean deleted = false;
                        while (iterator.hasNext()) {
                            JSONObject book = (JSONObject) iterator.next();
                            if (titleBook.equals(book.get("title"))) {
                                iterator.remove();
                                deleted = true;
                                System.out.println("Книга удалена!");
                            }
                        }

                        if (deleted) {
                            jsonObject.put("books", jsonArray);
                            saveChanges(jsonObject);
                        } else {
                            System.out.println("Книга не найдена.");
                        }
                        break;

                    case "4": // Вывести все книги
                        if (jsonArray.size() > 0) {
                            System.out.println("Все книги в файле:");
                            for (Object o : jsonArray) {
                                JSONObject book = (JSONObject) o;
                                System.out.println("Название: " + book.get("title"));
                                System.out.println("Автор: " + book.get("author"));
                                System.out.println("Год издания: " + book.get("year"));
                                System.out.println("------------------------");
                            }
                        } else {
                            System.out.println("Книг в файле нет.");
                        }
                        break;

                    case "5": // Выход
                        exit = true;
                        System.out.println("Выход из программы.");
                        break;

                    default: // Некорректный ввод
                        System.out.println("Некорректный ввод. Попробуйте снова.");
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод для сохранения изменений в JSON файл
    private static void saveChanges(JSONObject jsonObject) {
        try (FileWriter file = new FileWriter("untitled/src/LW8/Task2/example-json.json")) {
            file.write(jsonObject.toJSONString());
            System.out.println("JSON-файл успешно сохранен!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
