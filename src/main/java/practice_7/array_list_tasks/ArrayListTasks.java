package practice_7.array_list_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTasks {
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

    public ArrayListTasks() {
        arrayList.add(6);
    }

    public void printArrayList() {
        System.out.println("Весь список: " + arrayList);
    }
}
