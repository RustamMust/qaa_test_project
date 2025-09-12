package practice_7.study;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {
        // Создание стека
        Stack<Integer> stack = new Stack<>();
        System.out.println("Создан пустой Stack: " + stack);

        // Добавление элементов
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("После push: " + stack); // [10, 20, 30]

        // Получение верхнего элемента
        System.out.println("peek(): " + stack.peek()); // 30

        // Удаление элемента
        System.out.println("pop(): " + stack.pop()); // 30
        System.out.println("После pop: " + stack); // [10, 20]

        // Проверка пустоты
        System.out.println("Stack пуст? " + stack.empty()); // false

        // Поиск элемента
        System.out.println("search(10): " + stack.search(10)); // 2 (от вершины)
        System.out.println("search(50): " + stack.search(50)); // -1 (нет в стеке)

        // Использование `Deque` вместо `Stack`
        Deque<Integer> dequeStack = new ArrayDeque<>();
        dequeStack.push(100);
        dequeStack.push(200);
        dequeStack.push(300);
        System.out.println("DequeStack: " + dequeStack); // [300, 200, 100]

        // `Deque` работает как стек
        System.out.println("Deque pop(): " + dequeStack.pop()); // 300
        System.out.println("Deque после pop: " + dequeStack); // [200, 100]

        // Сравнение производительности `Stack` vs `Deque`
        Stack<Integer> stackPerf = new Stack<>();
        Deque<Integer> dequePerf = new ArrayDeque<>();

        long start, end;

        // Заполнение Stack
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stackPerf.push(i);
        }
        end = System.nanoTime();
        System.out.println("Stack: добавление 10k элементов = " + (end - start) / 1_000_000 + " мс");

        // Заполнение Deque
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            dequePerf.push(i);
        }
        end = System.nanoTime();
        System.out.println("Deque: добавление 10k элементов = " + (end - start) / 1_000_000 + " мс");
    }
}