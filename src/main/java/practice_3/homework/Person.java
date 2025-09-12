package practice_3.homework;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    Person (String someFirstName, String someLastName, String someSsn) {
        this.firstName = someFirstName;
        this.lastName = someLastName;
        this.ssn = someSsn;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getSsn() {
        return this.ssn;
    }

    void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    void printPersonInfo() {
        System.out.println("Name: " + this.firstName + ", " + "Lastname: " + this.lastName + ", " + "SSN: " + this.ssn);
    }
}
