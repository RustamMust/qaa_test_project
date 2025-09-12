package practice_7.homework.array_deque;

import java.util.ArrayDeque;

public class ElementsInQueue {
    ArrayDeque<Integer> elements;

    public ElementsInQueue() {
        this.elements = new ArrayDeque<>();
    }

    public void addElementToStart(Integer number) {
        elements.addFirst(number);
        System.out.println(elements);
    }

    public void addElementToEnd(Integer number) {
        elements.addLast(number);
        System.out.println(elements);
    }

    public void removeFirstElement() {
        elements.removeFirst();
        System.out.println(elements);
    }

    public void removeLastElement() {
        elements.removeLast();
        System.out.println(elements);
    }
}
