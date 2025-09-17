package complex_tasks.homework.task_1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest {
    @Test
    public void addEntityTest() {
        // 1. Create entityManager
        EntityManager<Student> entityManager = new EntityManager<>();

        int initialSizeOfList = entityManager.getAllElementsFromList().size();

        // 2. Create Student
        Student expectedStudent = new Student(17, "Alex", true);
        Student expectedStudentNewObject = new Student(17, "Alex", true);

        // 3. Add Student to entityManager
        entityManager.add(expectedStudent);

        // 4. Assert that entityManager contains Student
        assertTrue(entityManager.getAllElementsFromList().contains(expectedStudent));

        // 5. Assert that added Student has expected data
        Student actualStudent = entityManager.getAllElementsFromList().getFirst();
        assertEquals(expectedStudentNewObject, actualStudent);

        // 6. Assert that size of entityManager as expected
        int sizeOfListAfterAddingElement = entityManager.getAllElementsFromList().size();
        assertEquals(initialSizeOfList + 1, sizeOfListAfterAddingElement);
    }

    @Test
    public void removeEntityTest() {
        // 1. Create entityManager
        EntityManager<Student> entityManager = new EntityManager<>();

        int initialSizeOfList = entityManager.getAllElementsFromList().size();

        // 2. Create Student
        Student student = new Student(17, "Alex", true);

        // 3. Add Student to entityManager
        entityManager.add(student);

        // 4. Remove Student from entityManager
        boolean isRemoved = entityManager.remove(student);

        // 5. Assert that remove method returns true
        assertTrue(isRemoved);

        // 6. Assert that entityManager contains student returns false
        assertFalse(entityManager.getAllElementsFromList().contains(student));

        // 7. Assert size of entityManager
        int sizeOfListAfterRemovingElement = entityManager.getAllElementsFromList().size();
        assertEquals(initialSizeOfList, sizeOfListAfterRemovingElement);
    }

    @Test
    public void filterByAgeTest() {
        // 1. Create entityManager
        EntityManager<Student> entityManager = new EntityManager<>();

        // 2. Create 3 students
        Student student1 = new Student(17, "Alex", true);
        Student student2 = new Student(25, "Petya", false);
        Student student3 = new Student(35, "Kolya", true);

        // 3. Add students to entityManager
        entityManager.add(student1);
        entityManager.add(student2);
        entityManager.add(student3);

        // 4. Filter student by age
        List<Student> filteredByAgeStudents = entityManager.filterByAge(16, 18);

        // 5. Assert name of filtered student
        assertEquals("Alex", filteredByAgeStudents.getFirst().getName());

        // 6. Assert that filtered list contains only one element
        assertEquals(1, filteredByAgeStudents.size());
    }

    @Test
    public void filterByNameTest() {
        // 1. Create entityManager
        EntityManager<Student> entityManager = new EntityManager<>();

        // 2. Create 3 students
        Student student1 = new Student(17, "Alex", true);
        Student student2 = new Student(25, "Petya", false);
        Student student3 = new Student(35, "Kolya", true);

        // 3. Add students to entityManager
        entityManager.add(student1);
        entityManager.add(student2);
        entityManager.add(student3);

        // 4. Filter student by name
        List<Student> filteredByAgeStudents = entityManager.filterByName("Alex");

        // 5. Assert that filtered list contains only one element
        assertEquals(1, filteredByAgeStudents.size());

    }

    @Test
    public void filterByActiveTest() {
        // 1. Create entityManager
        EntityManager<Student> entityManager = new EntityManager<>();

        // 2. Create 3 students
        Student student1 = new Student(17, "Alex", true);
        Student student2 = new Student(25, "Petya", false);
        Student student3 = new Student(35, "Kolya", false);

        // 3. Add students to entityManager
        entityManager.add(student1);
        entityManager.add(student2);
        entityManager.add(student3);

        // 4. Filter student by active
        List<Student> filteredByAgeStudents = entityManager.filterByActive();

        // 5. Assert that filtered list contains only one element
        assertEquals(1, filteredByAgeStudents.size());
    }

}
