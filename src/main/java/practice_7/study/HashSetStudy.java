package practice_7.study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetStudy {
    public static void main(String[] args) {
        // Создание HashSet
        HashSet<String> set = new HashSet<>();
        System.out.println("Создан пустой HashSet: " + set);

        // Добавление элементов
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A"); // Дубликат, не добавится
        System.out.println("После добавлений: " + set); // [A, B, C] (порядок может быть разным)

        // Проверка наличия элемента
        System.out.println("Содержит 'A'? " + set.contains("A")); // true
        System.out.println("Содержит 'X'? " + set.contains("X")); // false

        // Удаление элементов
        set.remove("B");
        System.out.println("После удаления 'B': " + set); // [A, C]

        // Итерация по HashSet (for-each)
        System.out.print("Перебор элементов: ");
        for (String item : set) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Использование Iterator
        Iterator<String> iterator = set.iterator();
        System.out.print("Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Хранение null
        set.add(null);
        System.out.println("Добавили null: " + set); // [null, A, C]

        // Работа с LinkedHashSet (сохраняет порядок)
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(3);
        linkedSet.add(1);
        linkedSet.add(2);
        System.out.println("LinkedHashSet (сохраняет порядок): " + linkedSet); // [3, 1, 2]

        // Работа с TreeSet (отсортированный)
        TreeSet<Integer> treeSet = new TreeSet<>(linkedSet);
        System.out.println("TreeSet (отсортированный): " + treeSet); // [1, 2, 3]

        // Сравнение HashSet vs TreeSet
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet2 = new TreeSet<>();

        long start, end;

        // Добавление в HashSet
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            hashSet.add(i);
        }
        end = System.nanoTime();
        System.out.println("HashSet: добавление 10k элементов = " + (end - start) / 1_000_000 + " мс");

        // Добавление в TreeSet
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            treeSet2.add(i);
        }
        end = System.nanoTime();
        System.out.println("TreeSet: добавление 10k элементов = " + (end - start) / 1_000_000 + " мс");
    }
}