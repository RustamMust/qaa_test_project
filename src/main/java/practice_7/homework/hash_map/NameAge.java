package practice_7.homework.hash_map;

import java.util.HashMap;

public class NameAge {
    HashMap<String, Integer> nameAgeMap;

    public NameAge() {
        this.nameAgeMap = new HashMap<>();
    }

    public void addNameAgeToMap(String name, Integer age) {
        nameAgeMap.put(name, age);
    }

    public void printMap() {
        System.out.println("HashMap: " + nameAgeMap);
    }
}
