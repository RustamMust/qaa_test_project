package practice_7.array_list_tasks;

public class Main {
    public static void main(String[] args) {
        ArrayListTasks arrayListTasks = new ArrayListTasks();

        arrayListTasks.printArrayList();

        EvenOnly evenOnly = new EvenOnly();
        evenOnly.addNumbers(15);
        evenOnly.addNumbers(2);
        evenOnly.addNumbers(4);

        evenOnly.printList();
        evenOnly.printEvenNumbers();

    }
}
