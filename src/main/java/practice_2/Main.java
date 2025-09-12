package practice_2;

public class Main {
    public static void main(String[] args) {
        Student petya = new Student(18, "Petya");

        petya.printStudentInfo();

        Student kolya = new Student(20, "Kolya");

        kolya.printStudentInfo();

        petya.setName("Anton");
        petya.printStudentInfo();

        petya.setName("Petya");
        petya.printStudentInfo();

        kolya.setAge(21);
        kolya.printStudentInfo();

        System.out.println("Kolya age: " + kolya.getAge());
        System.out.println("Petya name: " + petya.getName());

        kolya.setAge(22);
        kolya.printStudentInfo();

        kolya.age = 25;
        kolya.printStudentInfo();

    }
}
