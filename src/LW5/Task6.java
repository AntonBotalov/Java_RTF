package LW5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\n" + "Делитель:" + "\n");
        int divisor = in.nextInt();

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Спикок до:" + "\n");
        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        List<Integer> filteredNumbers = filterNumbersByDivisor(integers, divisor);

        System.out.println("Числа, которые делятся на " + divisor + " без остатка:");
        for (Integer i : filteredNumbers) {
            System.out.println(i);
        }
    }

    public static List<Integer> filterNumbersByDivisor(List<Integer> list, int divisor) {
        return list.stream()
                .filter(n -> n % divisor == 0)
                .collect(Collectors.toList());
    }
}
