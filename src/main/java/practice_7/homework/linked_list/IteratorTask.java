package practice_7.homework.linked_list;


import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorTask {
    LinkedList<String> list;

    public IteratorTask() {
        this.list = new LinkedList<>();
    }

    public void addStringToList(String newString) {
        list.add(newString);
    }

    public void goThroughElements() {
        ListIterator<String> iterator = list.listIterator();

        System.out.println("Проходим вперед по списку:");
        while (iterator.hasNext()) {
            String currentElement = iterator.next();
            System.out.println(currentElement);
        }

        System.out.println("Проходим назад по списку:");
        while (iterator.hasPrevious()) {
            String currentElement = iterator.previous();
            System.out.println(currentElement);
        }
    }
}
