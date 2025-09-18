package complex_tasks.homework.task_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeServiceTest {
    private GradeService<Integer> gradeService;

    @BeforeEach
    public void setUp() {
        this.gradeService = new GradeService<>();
    }

    @Test
    public void addValidGradeTest() throws InvalidGradeException {
        StudentGrade<Integer> grade = new StudentGrade<>("Kolya", "Math", 90);

        gradeService.addGrade(grade);

        double average = gradeService.calculateAverageBySubject("Math");
        assertEquals(90.0, average);
    }

    @Test
    public void addInvalidGradeTest() {
        StudentGrade<Integer> grade = new StudentGrade<>("Kolya", "Math", -5);

        assertThrows(InvalidGradeException.class, () -> gradeService.addGrade(grade));
    }

    @Test
    public void calculateAverageBySubjectTest() throws InvalidGradeException {
        StudentGrade<Integer> grade1 = new StudentGrade<>("Kolya", "Math", 70);
        StudentGrade<Integer> grade2 = new StudentGrade<>("Petya", "Math", 90);

        gradeService.addGrade(grade1);
        gradeService.addGrade(grade2);

        double average = gradeService.calculateAverageBySubject("Math");
        assertEquals(80.0, average);
    }

    @Test
    public void calculateAverageByEmptySubjectTest() {
        assertThrows(InvalidGradeException.class, () -> gradeService.calculateAverageBySubject("Math"));
    }
}
