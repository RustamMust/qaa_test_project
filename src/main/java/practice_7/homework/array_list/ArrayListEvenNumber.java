package practice_7.homework.array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEvenNumber {
    ArrayList<Integer> arrayListEvenNumber;

    public ArrayListEvenNumber() {
        this.arrayListEvenNumber = new ArrayList<>();
    }

    public void addNumberToArrayList(Integer number) {
        arrayListEvenNumber.add(number);
    }

    public void printArrayListEvenNumber() {
        System.out.println("Even List: " + arrayListEvenNumber);
    }

    public void printAllEvenNumbers() {
        System.out.println();

        Iterator<Integer> IteratorForList = arrayListEvenNumber.iterator();
        System.out.println("Even numbers: ");

        while (IteratorForList.hasNext()) {
            Integer num = IteratorForList.next();
            if (num % 2 == 0) {
                System.out.println(num + " ");
            }
        }
        System.out.println();
    }
}
