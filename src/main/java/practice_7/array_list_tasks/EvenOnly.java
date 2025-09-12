package practice_7.array_list_tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenOnly {
    ArrayList<Integer> listEvenOnly;

    public EvenOnly() {
        this.listEvenOnly = new ArrayList<>();
    }

    public void addNumbers(Integer number) {
        listEvenOnly.add(number);
    }

    public void printList() {
        System.out.println("Весь список: " + listEvenOnly);
    }

    public void printEvenNumbers() {
        Iterator<Integer> iteratorForList = listEvenOnly.iterator();

        System.out.print("Чётные числа: ");
        while (iteratorForList.hasNext()) {
            Integer num = iteratorForList.next();
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public String findStringWithMaxLength(ArrayList<String> strings) {
        Integer max = 0;
        String maxString = "";

       for (String str : strings) {
           if (str.length() > max) {
               max = str.length();
               maxString = str;
           }
       }
       return maxString;
    }
}
