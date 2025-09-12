package practice_7.homework.linked_list;

import java.util.LinkedList;

public class FirstLastInList {
    LinkedList<String> linkedList;

    public FirstLastInList() {
        this.linkedList = new LinkedList<>();
    }

    public void addStringToList(String newString) {
        linkedList.add(newString);
    }

    public void printFirstAndLastElement() {
        if (!linkedList.isEmpty()) {
            String firstElement = linkedList.getFirst();
            String lastElement = linkedList.getLast();

            System.out.println("Fist element: " + firstElement + ", last element: " + lastElement);
        }
    }
}
