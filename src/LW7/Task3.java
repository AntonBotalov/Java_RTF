package LW7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws IOException {
        String fileName = "untitled/src/LW7/input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int lineCount = 0;
        while (reader.readLine() != null) lineCount++;
        reader.close();
        System.out.println("Кол-во строк: " + lineCount);
    }
}
