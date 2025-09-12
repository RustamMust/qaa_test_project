package practice_7.homework.tree_map;

import java.util.TreeMap;

public class AddNames {
    TreeMap<String, Integer> names;

    public AddNames() {
        this.names = new TreeMap<>();
    }

    public void addNameToTreeMap(String name, Integer number) {
        names.put(name, number);
    }

    public void printTreeMap() {
        System.out.println("TreeMap: " + names);
    }
}
