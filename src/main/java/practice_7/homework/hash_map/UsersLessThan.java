package practice_7.homework.hash_map;

import java.util.HashMap;

public class UsersLessThan {
    HashMap<String, Integer> nameAgeMap;

    public UsersLessThan() {
        this.nameAgeMap = new HashMap<>();
    }

    public void addNameAgeToMap(String name, Integer age) {
        nameAgeMap.put(name, age);
    }

    public void printUnderage() {
        nameAgeMap.forEach(
                (name, age) -> {
                    if (age < 18) {
                        System.out.println("Имя " + name + ", возраст " + age);
                    }
                }
        );
    }
}
