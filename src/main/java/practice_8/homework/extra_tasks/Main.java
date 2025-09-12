package practice_8.homework.extra_tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 1. Обобщённый класс
        Storage<String> stringStorage = new Storage<>();
        stringStorage.setElement("Хранение");
        System.out.println(stringStorage.getElement());

        Storage<Integer> integerStorage = new Storage<>();
        integerStorage.setElement(1);
        System.out.println(integerStorage.getElement());

        // 2. Обобщённый метод
        List<String> strings = List.of("one", "two", "three");
        List<Integer> numbers = List.of(1, 2, 3, 4);

        printList(strings);
        printList(numbers);

        // 3. Работа с числами
        NumberBox<Integer> integerNumberBox = new NumberBox<>();
        integerNumberBox.addNumber(1);
        integerNumberBox.addNumber(2);
        integerNumberBox.addNumber(3);

        System.out.println("Sum of numbers: " + integerNumberBox.getSum());

        NumberBox<Double> doubleNumberBox = new NumberBox<>();
        doubleNumberBox.addNumber(1.5);
        doubleNumberBox.addNumber(2.5);
        doubleNumberBox.addNumber(3.5);
        doubleNumberBox.addNumber(4.1);

        System.out.println("Sum of numbers: " + doubleNumberBox.getSum());

        // 4. Ограничение сверху
        List<Integer> integerList = List.of(1,2,3,4,5);
        System.out.println(sum(integerList));

        List<Double> doubleList = List.of(1.5, 4.5, 3.5);
        System.out.println(sum(doubleList));

        // 5. Ограничение снизу
        List<Number> numbers4 = new ArrayList<>();
        addNumbers(numbers4);

        for (Object obj : numbers4) {
            Integer num = (Integer) obj;
            System.out.println(num);
        }

        // 6. Обобщённый интерфейс
        SingleContainer<String> stringContainer = new SingleContainer<>();
        stringContainer.add("Привет");
        System.out.println(stringContainer.get());

        SingleContainer<Integer> intContainer = new SingleContainer<>();
        intContainer.add(42);
        System.out.println(intContainer.get());

        // 7. Коллекция с обобщёнными типами
        Map<String, Integer> map1 = Map.of(
                "Один", 1,
                "Два", 2,
                "Три", 3
        );
        System.out.println("Map<String, Integer>:");
        printMap(map1);


        Map<Integer, String> map2 = Map.of(
                1, "Apple",
                2, "Banana",
                3, "Cherry"
        );
        System.out.println("\nMap<Integer, String>:");
        printMap(map2);

    }

    public static <T> void printList(List<T> elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public static <T extends Number> double sum(List<T> list) {
        double total = 0.0;

        for (T element : list) {
            total+=element.doubleValue();
        }
        return total;
    }

    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }
}
