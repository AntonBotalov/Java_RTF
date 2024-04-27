package LW5;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "123orange", "grape123", "pear", "pineapple!");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> filteredStrings = filterStringsContainingOnlyLetters(strings);

        System.out.println("\nСтроки, содержащие только буквы:");
        for (String e : filteredStrings) {
            System.out.println(e);
        }
    }

    public static List<String> filterStringsContainingOnlyLetters(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }
}
