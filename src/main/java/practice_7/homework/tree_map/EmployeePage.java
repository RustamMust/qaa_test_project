package practice_7.homework.tree_map;

import java.util.TreeMap;

public class EmployeePage {
    TreeMap<Integer, String> employeePage;

    public EmployeePage() {
        this.employeePage = new TreeMap<>();
    }

    public void addEmployee(Integer id, String name) {
        employeePage.put(id, name);
    }

    public void printHigherKey(Integer id) {
        Integer higherKey = employeePage.higherKey(id);
        System.out.println("Higher key: " + higherKey);
    }
}
