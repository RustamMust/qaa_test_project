package practice_3;

public class Main {
    public static void main (String[] args) {
        System.out.println("Student count: " + Student.studentCount);
        Student petya = new Student(15, "Petya");
        Student kolya = new Student(18, "Kolya");

        System.out.println("Student count: " + Student.studentCount);

        System.out.println(petya.age);
        System.out.println(kolya.age);
        System.out.println(Student.MAX_YEARS);

        Student.printMaxYears();
    }
}
