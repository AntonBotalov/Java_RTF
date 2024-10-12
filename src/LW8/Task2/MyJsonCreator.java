package LW8.Task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class MyJsonCreator {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("name", "Тузик");
        book1.put("genus", "Собака");
        book1.put("year", 2015);

        JSONObject book2 = new JSONObject();
        book2.put("name", "Барсик");
        book2.put("genus", "Кошка");
        book2.put("year", 2020);

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try (FileWriter file = new FileWriter("untitled/src/LW8/Task2/animals-json.json")) {
            file.write(library.toJSONString());
            System.out.println("JSON-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
