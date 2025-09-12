package practice_7.homework.tree_set;

public class Main {
    public static void main(String[] args) {
        AddNumbers addNumbers = new AddNumbers();
        addNumbers.addNumbersToSet(1);
        addNumbers.addNumbersToSet(3);
        addNumbers.addNumbersToSet(2);
        addNumbers.addNumbersToSet(5);
        addNumbers.addNumbersToSet(4);

        addNumbers.printNumbers();


        AddNumbersNoDuplicates addNumbersNoDuplicates = new AddNumbersNoDuplicates();
        addNumbersNoDuplicates.addNumbers(1);
        addNumbersNoDuplicates.addNumbers(2);
        addNumbersNoDuplicates.addNumbers(1);
        addNumbersNoDuplicates.addNumbers(1);
        addNumbersNoDuplicates.addNumbers(2);
        addNumbersNoDuplicates.addNumbers(3);
        addNumbersNoDuplicates.addNumbers(4);

        addNumbersNoDuplicates.printSet();


        ClosestNumber closestNumber = new ClosestNumber();
        closestNumber.addNumbers(1);
        closestNumber.addNumbers(2);
        closestNumber.addNumbers(3);
        closestNumber.addNumbers(4);
        closestNumber.addNumbers(5);
        closestNumber.addNumbers(6);
        closestNumber.addNumbers(7);
        closestNumber.addNumbers(8);

        closestNumber.printHigherValue(5);
        closestNumber.printLowerValue(4);

    }
}
