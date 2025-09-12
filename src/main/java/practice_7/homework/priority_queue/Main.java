package practice_7.homework.priority_queue;

public class Main {
    public static void main(String[] args) {
        QueueWithNumbers queue = new QueueWithNumbers();
        queue.addNumber(12);
        queue.addNumber(10);
        queue.addNumber(1);
        queue.addNumber(3);
        queue.addNumber(4);

        queue.printQueue();
    }
}
