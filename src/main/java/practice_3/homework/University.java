package practice_3.homework;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    University (int someStudentID, String someStudentName) {
        this.studentID = someStudentID;
        this.studentName = someStudentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    String getStudentName() {
        return this.studentName;
    }

    void printStudentInfo() {
        System.out.println("Name: " + this.studentName + ", " + "university: " + universityName + ", " + "ID: " + this.studentID);
    }
}
