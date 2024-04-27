package LW5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\n" + "Длина слова:" + "\n");
        int minLength = in.nextInt();

        List<String> strings = List.of("apple", "banana", "orange", "grape", "pear", "pineapple");

        List<String> filteredStrings = filterStringsByLength(strings, minLength);

        System.out.println("Строки с длиной больше " + minLength + ":");
        for (String i : filteredStrings) {
            System.out.println(i);
        }
    }

    public static List<String> filterStringsByLength(List<String> list, int minLength) {
        return list.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }
}
