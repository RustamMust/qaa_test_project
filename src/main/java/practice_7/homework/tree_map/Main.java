package practice_7.homework.tree_map;

public class Main {
    public static void main(String[] args) {
        AddNames addNames = new AddNames();

        addNames.addNameToTreeMap("firstName", 1);
        addNames.addNameToTreeMap("Rustam", 2);
        addNames.addNameToTreeMap("Anatoliy", 43);
        addNames.addNameToTreeMap("Maria", 23);
        addNames.addNameToTreeMap("Alex", 233);

        addNames.printTreeMap();


        MinMaxKeys minMaxKeys = new MinMaxKeys();
        minMaxKeys.addKeysValues(30, "string1");
        minMaxKeys.addKeysValues(40, "string2");
        minMaxKeys.addKeysValues(10, "string3");
        minMaxKeys.addKeysValues(70, "string4");
        minMaxKeys.addKeysValues(4, "string5");

        minMaxKeys.printFirstKey();
        minMaxKeys.printLastKey();

        EmployeePage employeePage = new EmployeePage();
        employeePage.addEmployee(20, "firstName");
        employeePage.addEmployee(100, "secondName");
        employeePage.addEmployee(120, "thirdName");
        employeePage.addEmployee(150, "Name");
        employeePage.addEmployee(180, "OneName");

        employeePage.printHigherKey(140);

    }
}
