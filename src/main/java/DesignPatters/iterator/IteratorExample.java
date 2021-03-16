package DesignPatters.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jonas");
        names.add("Ada");
        names.add("Ala");

        Iterator<String> namesIterator = names.iterator();
        System.out.println(namesIterator.next());
        System.out.println(namesIterator.next());
        System.out.println(namesIterator.next());
    }
}
