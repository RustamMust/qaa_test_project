package complex_tasks.homework.task_6;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskServiceTest {

    @Test
    public void addAndFindTaskTest() {
        TaskService<Integer> service = new TaskService<>();
        Task<Integer> task1 = new Task<>(1, "NEW", "HIGH", LocalDate.now());

        service.addTask(task1);

        List<Task<Integer>> tasks = service.findByStatus("NEW");

        assertEquals(1, tasks.size());

        assertEquals("HIGH", tasks.getFirst().getPriority());
    }

    @Test
    public void removeTaskTest() {
        TaskService<Integer> service = new TaskService<>();
        Task<Integer> task1 = new Task<>(1, "NEW", "HIGH", LocalDate.now());

        service.addTask(task1);

        boolean isRemoved = service.removeTask(1);
        assertTrue(isRemoved);
        assertTrue(service.findByStatus("NEW").isEmpty());
    }

    @Test
    public void sortTaskByDateTest() {
        TaskService<Integer> service = new TaskService<>();
        Task<Integer> task1 = new Task<>(1, "NEW", "LOW", LocalDate.of(2023, 1, 1));
        Task<Integer> task2 = new Task<>(2, "DONE", "HIGH", LocalDate.of(2024, 1, 1));
        Task<Integer> task3 = new Task<>(3, "NEW", "MEDIUM", LocalDate.of(2022, 1, 1));

        service.addTask(task1);
        service.addTask(task2);
        service.addTask(task3);

        List<Task<Integer>> sortedAsc = service.sortByDateAsc();
        assertEquals(3, sortedAsc.get(0).getId());
        assertEquals(2, sortedAsc.get(2).getId());

        List<Task<Integer>> sortedDesc = service.sortByDateDesc();
        assertEquals(2, sortedDesc.get(0).getId());
        assertEquals(3, sortedDesc.get(2).getId());

    }
}
