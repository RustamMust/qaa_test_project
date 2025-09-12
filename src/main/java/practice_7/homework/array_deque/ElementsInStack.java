package practice_7.homework.array_deque;

import java.util.ArrayDeque;

public class ElementsInStack {
    ArrayDeque<Integer> elements;

    public ElementsInStack() {
        this.elements = new ArrayDeque<>();
    }

    public void addElement(Integer number) {
        elements.push(number);
    }

    public void printElements() {
        System.out.println("Elements:");
        while (!elements.isEmpty()) {
            System.out.println(elements.pop());
        }
    }
}
