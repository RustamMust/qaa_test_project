package practice_7.homework.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAddNumber {
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

    public void addNewNumberInList(Integer number) {
        arrayList.add(number);
    }

    public void printArrayList() {
        System.out.println("List: " + arrayList);
    }
}
