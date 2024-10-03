package LW7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Example7 {
    public static void main(String[] args) {
        Person person = new Person("Anton", 24);
        try {
            FileOutputStream fileOut = new FileOutputStream("untitled/src/LW7/person.json");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in person.ser");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
