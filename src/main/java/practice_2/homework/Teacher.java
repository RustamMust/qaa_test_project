package practice_2.homework;

public class Teacher {
    String name;
    String subject;

    Teacher(String someName, String someSubject) {
        this.name = someName;
        this.subject = someSubject;
    }

    String getName () {
        return this.name;
    }

    String getSubject () {
        return this.subject;
    }

    void setName (String newName) {
        this.name = newName;
    }

    void setSubject (String newSubject) {
        this.subject = newSubject;
    }

    void printInfo() {
        System.out.println("Name: " + this.name + ", " + "subject: " + this.subject + ".");
    }
}
