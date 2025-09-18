package complex_tasks.homework.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GradeService<T extends Number> {
    private final List<StudentGrade<T>> gradeList = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> grade) throws InvalidGradeException {
        if (grade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("Оценка не может быть меньше 0.");
        }
        gradeList.add(grade);
    }

    public synchronized double calculateAverageBySubject(String subject) throws InvalidGradeException {
        List<StudentGrade<T>> subjectGrades = gradeList.stream()
                .filter(grade -> grade.getSubject().equalsIgnoreCase(subject))
                .collect(Collectors.toList());

        if (subjectGrades.isEmpty()) {
            throw new InvalidGradeException("Нет оценок по предмету.");
        }

        return subjectGrades.stream()
                .mapToDouble(grade -> grade.getGrade().doubleValue())
                .average()
                .orElseThrow(() -> new InvalidGradeException("Нет оценок по предмету."));
    }


}
