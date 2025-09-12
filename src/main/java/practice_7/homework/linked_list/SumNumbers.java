package practice_7.homework.linked_list;

import java.util.LinkedList;

public class SumNumbers {
    LinkedList<Integer> linkedList;

    public SumNumbers () {
        this.linkedList = new LinkedList<>();
    }

    public void addNumbersToList(Integer number) {
        linkedList.add(number);
    }

    int totalSum = 0;
    public void printSumNumbers() {
        linkedList.forEach(
                currentNumber -> totalSum+=currentNumber
        );
        System.out.println("Total sum: " + totalSum);
    }
}
