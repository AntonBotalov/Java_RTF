package LW1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a namber:");
        int num = in.nextInt();

        System.out.println("You number" + num);

        in.close();
    }
}
