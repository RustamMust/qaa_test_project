package practice_7.homework.array_list;


import java.util.ArrayList;

public class MaxNumber {
    ArrayList<Integer> arrayList;

    public MaxNumber () {
        this.arrayList = new ArrayList<>();
    }

    public void addNumberToList(Integer number) {
        arrayList.add(number);
    }

    int maxNumber = 0;
    public void printMaxNumber() {
        arrayList.forEach(
                currentNumber -> {
                    if (currentNumber > maxNumber) {
                        maxNumber = currentNumber;
                    }
                }
        );
        System.out.println("Max number: " + maxNumber);
    }
}
