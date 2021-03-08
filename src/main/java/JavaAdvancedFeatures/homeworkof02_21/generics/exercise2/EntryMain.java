package JavaAdvancedFeatures.homeworkof02_21.generics.exercise2;

import java.util.Arrays;
import java.util.List;

public class EntryMain {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "B", "C", "d");
        List<Integer> integers = Arrays.asList(2, 999, 12, -22);

        Entry<String> stringEntry = new Entry<>(strings);
        Entry<Integer> integerEntry = new Entry<>(integers);

        System.out.println(stringEntry.lastEntry());
        System.out.println(integerEntry.firstEntry());
    }
}
