package practice_7.homework.hash_map;

import java.util.HashMap;

public class NameInMap {
    HashMap<String, Integer> names;

    public NameInMap() {
        this.names = new HashMap<>();
    }

    public void addNameAgeToMap(String name, Integer age) {
        names.put(name, age);
    }

    public void printContainsNameInMap(String name) {
        if (names.containsKey(name)) {
            System.out.println("Имя " + name + " есть в HashMap.");
        } else {
            System.out.println("Имени " + name + " нет в HashMap.");
        }
    }
}
