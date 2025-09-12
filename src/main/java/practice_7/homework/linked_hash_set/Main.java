package practice_7.homework.linked_hash_set;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        StringsInLinkedHashSet stringsInLinkedHashSet = new StringsInLinkedHashSet();
        stringsInLinkedHashSet.addStrings("first");
        stringsInLinkedHashSet.addStrings("second");
        stringsInLinkedHashSet.addStrings("third");
        stringsInLinkedHashSet.addStrings("four");
        stringsInLinkedHashSet.addStrings("five");

        stringsInLinkedHashSet.printLinkedHashSet();


        LinkedHashSet<String> set = new LinkedHashSet<>();
        NoDuplicates.addUniqueNames(set, "Rustam");
        NoDuplicates.addUniqueNames(set, "Petya");
        NoDuplicates.addUniqueNames(set, "Kolya");
        NoDuplicates.addUniqueNames(set, "Rustam");

        System.out.println("LinkedHashSet: " + set);
    }
}
