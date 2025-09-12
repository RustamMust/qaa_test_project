package practice_7.homework.linked_hash_set;

import java.util.LinkedHashSet;

public class NoDuplicates {
    public static void addUniqueNames(LinkedHashSet<String> set, String element) {
        if (!set.contains(element)) {
            set.add(element);
        }
    }
}
