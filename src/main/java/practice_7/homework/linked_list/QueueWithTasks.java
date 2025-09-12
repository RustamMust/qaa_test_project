package practice_7.homework.linked_list;

import java.util.LinkedList;

public class QueueWithTasks {
    LinkedList<String> queue;

    public QueueWithTasks() {
        this.queue = new LinkedList<>();
    }

    public void addTaskToQueue(String newTask) {
        queue.add(newTask);
    }

    public void processWithTasks() {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }


}
