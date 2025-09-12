package practice_3.homework;

public class Main {
    public static void main(String[] args) {
        Company employer1 = new Company(20, "Rustam");
        Company employer2 = new Company(25, "Brad");
        Company.companyName = "Great company";
        Company.printCompanyName();

        Company.companyName = "Second company";
        Company.printCompanyName();

        MathConstants.calculateCircumference(10);
        MathConstants.calculateCircumference(12);
        MathConstants.calculateCircleArea(5);
        MathConstants.calculateCircleArea(6);

        University student1 = new University(1, "Rustam");
        University student2 = new University(2, "Brad");
        University student3 = new University(3, "Alex");

        University.changeUniversityName("New university");
        student1.printStudentInfo();

        GameSettings game1 = new GameSettings("Football", 5);
        GameSettings game2 = new GameSettings("Chess", 1);

        GameSettings.setMaxPlayers(6);
        game1.addPlayer();
        game1.printGameStatus();

        Person person1 = new Person("Rustam", "Mustafaev", "123-45-67811");
        Person person2 = new Person("Iliya", "Petrov", "345-12-4325");

        person1.setFirstName("Kolya");
        person1.printPersonInfo();

    }
}
