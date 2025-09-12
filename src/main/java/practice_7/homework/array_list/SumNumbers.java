package practice_7.homework.array_list;

import java.util.ArrayList;

public class SumNumbers {
    ArrayList<Integer> arrayList;

    public SumNumbers() {
        this.arrayList = new ArrayList<>();
    }

    public void addNumbersToList(Integer number) {
        arrayList.add(number);
    }

    int totalSum = 0;

    public void printSumNumbers() {
        arrayList.forEach(
                currentNumber -> totalSum+=currentNumber
        );
        System.out.println("Total sum: " + totalSum);
    }
}
