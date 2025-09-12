package practice_7.homework.hash_set;

import java.util.HashSet;
import java.util.Set;

public class Numbers {
    HashSet<Integer> hashSet = new HashSet<>(Set.of(1,2,3,4,5));

    public void printHashSet() {
        System.out.println("HashSet: " + hashSet);
    }
}
