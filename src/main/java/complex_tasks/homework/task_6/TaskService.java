package complex_tasks.homework.task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService<T> {
    private final List<Task<T>> tasks = new ArrayList<>();

    public synchronized void addTask(Task<T> task) {
        boolean isExist = tasks.stream()
                .anyMatch(t -> t.getId().equals(task.getId()));

        if (!isExist) {
            tasks.add(task);
        }
    }

    public synchronized boolean removeTask(T id) {
        return tasks.removeIf(task -> task.getId().equals(id));
    }

    public List<Task<T>> findByStatus(String status) {
        return tasks.stream()
                .filter(task -> task.getStatus().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }

    public List<Task<T>> findByPriority(String priority) {
        return tasks.stream()
                .filter(task -> task.getPriority().equalsIgnoreCase(priority))
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortByDateAsc() {
        return tasks.stream()
                .sorted((t1, t2) -> t1.getDate().compareTo(t2.getDate()))
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortByDateDesc() {
        return tasks.stream()
                .sorted((t1, t2) -> t2.getDate().compareTo(t1.getDate()))
                .collect(Collectors.toList());
    }
}
