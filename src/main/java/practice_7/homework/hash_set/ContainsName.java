package practice_7.homework.hash_set;

import java.util.HashSet;

public class ContainsName {
    HashSet<String> names;

    public ContainsName() {
        this.names = new HashSet<>();
    }

    public void addNameToHashSet(String newName) {
        names.add(newName);
    }

    public void printContainsName(String name) {
        if (names.contains(name)) {
            System.out.println("Имя " + name + " есть в HashSet");
        } else {
            System.out.println("Имени " + name + " нет в HashSet");
        }
    }
}
