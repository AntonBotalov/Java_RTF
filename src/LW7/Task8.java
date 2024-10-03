package LW7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Task8 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Cat cat = new Cat("Рыжий", 2);
        String fileName = "untitled/src/LW7/cat.bin";
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(cat);
            System.out.println("Объект записан!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fileIn);
            Cat restoreCat = (Cat) ois.readObject();
            System.out.println("Объект считан!");

            // Вывод данных
            System.out.println("Объект после считывания: ");
            System.out.println(restoreCat.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
