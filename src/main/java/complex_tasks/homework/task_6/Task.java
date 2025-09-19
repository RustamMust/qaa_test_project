package complex_tasks.homework.task_6;

import java.time.LocalDate;

public class Task<T> {
    private final T id;
    private final String status;
    private final String priority;
    private final LocalDate date;

    public Task(T id, String status, String priority, LocalDate date) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }
}