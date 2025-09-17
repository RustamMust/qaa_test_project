package complex_tasks.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntityManagerTest {
    /**
     * ТЕСТ КЕЙСЫ
     * Добавление элементов:
     *      добавить 1 элемент в пустой менеджер, было 0 элементов стало 1 элемент
     *      добавить 1 элемент в непустой менеджер, было 2 элемента стало 3 элемента
     *      добавить 1 элемент несколькими потоками (проверяем потокобезопасность нашего списка)
     */

    @Test
    public void addEntityTest() {
        EntityManager<Student> entityManager = new EntityManager<>();

        int initialSize = entityManager.getAll().size();

        Student expectedStudent = new Student("Коля", 19, true);
        Student expectedStudentNewObject = new Student("Коля", 19, true);

        entityManager.add(expectedStudent);

        // добавить элемент
        // ожидание 1: элемент содержится в финальном списке
        // ожидание 2: то, что мы добавили равно тому, что мы передали
        // ожидание 3: добавлен 1 элемент

        // ожидание 1
        assertTrue(entityManager.getAll().contains(expectedStudent));

        // ожидание 2
        Student actualStudent = entityManager.getAll().getFirst();
        assertEquals(expectedStudentNewObject, actualStudent);

        // ожидание 3
        assertEquals(initialSize + 1, entityManager.getAll().size());
    }
}
