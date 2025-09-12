package practice_7.homework.linked_hash_set;

import java.util.LinkedHashSet;

public class StringsInLinkedHashSet {
    LinkedHashSet<String> stringWords;

    public StringsInLinkedHashSet() {
        this.stringWords = new LinkedHashSet<>();
    }

    public void addStrings(String newString) {
        stringWords.add(newString);
    }

    public void printLinkedHashSet() {
        System.out.println("LinkedHashSet: " + stringWords);
    }
}
