package practice_7.homework.linked_list;

import java.util.LinkedList;

public class AddStrings {
    LinkedList<String> linkedList;

    public AddStrings() {
        this.linkedList = new LinkedList<>();
    }

    public void addStringToList(String newString) {
        linkedList.add(newString);
    }

    public void printAllElementsFromList() {
        System.out.println("List:");
        linkedList.forEach(System.out::println);
    }
}
