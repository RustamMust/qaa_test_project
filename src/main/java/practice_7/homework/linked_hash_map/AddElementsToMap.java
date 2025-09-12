package practice_7.homework.linked_hash_map;

import java.util.LinkedHashMap;

public class AddElementsToMap {
    LinkedHashMap<String, Integer> elements;

    public AddElementsToMap() {
        this.elements = new LinkedHashMap<>();
    }

    public void addElements(String name, Integer number) {
        elements.put(name, number);
    }

    public void printElements() {
        System.out.println("LinkedHashMap: " + elements);
    }
}
