package JavaAdvancedFeatures.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {
    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("Tom", "Brandon", "Michael", "Bob");

        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());

        List<String> sortedInReverseOrder = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sortedNames);
        System.out.println(sortedInReverseOrder);
    }
}

