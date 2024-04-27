package LW5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Спикок до: ");
        int size = in.nextInt();


        System.out.println("\n" + "Число для сравнения: " );
        int threshold = in.nextInt();

        for (int i = 0; i < size; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        List<Integer> filteredNumbers = filterNumbersLessThanThreshold(integers, threshold);

        System.out.println("\nЧисла меньше " + threshold + ":");
        for (Integer i : filteredNumbers) {
            System.out.println(i);
        }
    }

    public static List<Integer> filterNumbersLessThanThreshold(List<Integer> list, int threshold) {
        return list.stream()
                .filter(n -> n < threshold)
                .collect(Collectors.toList());
    }
}
