package practice_7.homework.priority_queue;

import java.util.PriorityQueue;

public class QueueWithNumbers {
    PriorityQueue<Integer> numbers;

    public QueueWithNumbers() {
        this.numbers = new PriorityQueue<>();
    }

    public void addNumber(Integer number) {
        numbers.add(number);
    }

    public void printQueue() {
        System.out.println("Priority queue:");
        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }
    }
}
