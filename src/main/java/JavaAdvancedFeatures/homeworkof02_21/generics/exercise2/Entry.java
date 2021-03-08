package JavaAdvancedFeatures.homeworkof02_21.generics.exercise2;

import java.util.List;

public class Entry<T> {
    private List<T> entries;

    public Entry(List<T> entries) {
        this.entries = entries;
    }

    public T lastEntry() {
        return entries.get(entries.size() - 1);
    }

    public T firstEntry() {
        return entries.get(0);
    }
}
