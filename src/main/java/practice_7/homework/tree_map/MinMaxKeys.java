package practice_7.homework.tree_map;

import java.util.TreeMap;

public class MinMaxKeys {
    TreeMap<Integer, String> map;

    public MinMaxKeys() {
        this.map = new TreeMap<>();
    }

    public void addKeysValues(Integer number, String name) {
        map.put(number, name);
    }

    public void printFirstKey() {
        System.out.println("First key: " + map.firstKey());
    }

    public void printLastKey() {
        System.out.println("Last key: " + map.lastKey());
    }
}
