package practice_7.homework.linked_list;

public class Main {
    public static void main(String[] args) {
        AddStrings addStrings = new AddStrings();
        addStrings.addStringToList("a");
        addStrings.addStringToList("ertt");
        addStrings.addStringToList("sssererer");

        addStrings.printAllElementsFromList();

        QueueWithTasks queue = new QueueWithTasks();

        queue.addTaskToQueue("firstTask");
        queue.addTaskToQueue("secondTask");
        queue.addTaskToQueue("thirdTask");

        queue.processWithTasks();

        FirstLastInList firstLastInList = new FirstLastInList();
        firstLastInList.addStringToList("fistString");
        firstLastInList.addStringToList("secondString");
        firstLastInList.addStringToList("thirdString");
        firstLastInList.addStringToList("fourthString");

        firstLastInList.printFirstAndLastElement();

        SumNumbers sumNumbers = new SumNumbers();
        sumNumbers.addNumbersToList(1);
        sumNumbers.addNumbersToList(2);
        sumNumbers.addNumbersToList(3);
        sumNumbers.addNumbersToList(10);

        sumNumbers.printSumNumbers();

        IteratorTask iteratorTask = new IteratorTask();
        iteratorTask.addStringToList("first");
        iteratorTask.addStringToList("second");
        iteratorTask.addStringToList("third");
        iteratorTask.addStringToList("more");
        iteratorTask.addStringToList("task");
        iteratorTask.addStringToList("end");

        iteratorTask.goThroughElements();
    }
}
