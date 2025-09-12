package practice_7.homework.array_list;

public class Main {
    public static void main(String[] args) {
        ArrayListAddNumber arrayListAddNumber = new ArrayListAddNumber();

        arrayListAddNumber.printArrayList();

        arrayListAddNumber.addNewNumberInList(6);
        arrayListAddNumber.printArrayList();


        ArrayListEvenNumber arrayListEvenNumber = new ArrayListEvenNumber();
        arrayListEvenNumber.addNumberToArrayList(6);
        arrayListEvenNumber.addNumberToArrayList(10);
        arrayListEvenNumber.addNumberToArrayList(3);
        arrayListEvenNumber.addNumberToArrayList(5);
        arrayListEvenNumber.addNumberToArrayList(4);
        arrayListEvenNumber.addNumberToArrayList(7);

        arrayListEvenNumber.printArrayListEvenNumber();

        arrayListEvenNumber.printAllEvenNumbers();

        LongestString longestString = new LongestString();
        longestString.addStringToList("a");
        longestString.addStringToList("ab");
        longestString.addStringToList("abc");
        longestString.addStringToList("abcd");

        longestString.printLongestStringFromList();

        SumNumbers sumNumbers = new SumNumbers();
        sumNumbers.addNumbersToList(2);
        sumNumbers.addNumbersToList(3);
        sumNumbers.addNumbersToList(1);
        sumNumbers.addNumbersToList(4);

        sumNumbers.printSumNumbers();

        MaxNumber maxNumber = new MaxNumber();
        maxNumber.addNumberToList(1);
        maxNumber.addNumberToList(2);
        maxNumber.addNumberToList(3);
        maxNumber.addNumberToList(4);
        maxNumber.addNumberToList(5);
        maxNumber.printMaxNumber();

    }
}
