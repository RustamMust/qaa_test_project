package practice_7.homework.array_deque;

import java.util.ArrayDeque;

public class ElementsInDeque {
    ArrayDeque<Integer> elements;

    public ElementsInDeque() {
        this.elements = new ArrayDeque<>();
    }

    public void addElement(Integer number) {
        elements.add(number);
    }

    public void printElements() {
        System.out.println("ArrayDeque: " + elements);
    }
}
