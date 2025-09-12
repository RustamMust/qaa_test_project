package practice_3.homework;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    Company (int someEmployeeID, String someEmployeeName) {
        this.employeeID = someEmployeeID;
        this.employeeName = someEmployeeName;
    }

    String getEmployeeName () {
        return this.employeeName;
    }

    void setEmployeeName (String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }

    static void printCompanyName() {
        System.out.println("Company name: " + companyName);
    }
}
