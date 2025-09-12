package practice_8.homework.generics;


public class Main {
    public static void main(String[] args) {
        Box<String> boxString = new Box<>();
        boxString.setElement("Элемент в коробке");
        System.out.println(boxString.getElement());

        Box<Integer> boxInteger = new Box<>();
        boxInteger.setElement(123422);
        System.out.println(boxInteger.getElement());

        String[] stringElements = {"one", "two", "three"};
        printArray(stringElements);

        Integer[] integerElements = {1, 2, 3, 4};
        printArray(integerElements);


        Pair<String, Integer> pair1 = new Pair<>("Книга1", 50);
        System.out.println(pair1.getFirstElement());
        System.out.println(pair1.getSecondElement());

        Pair<Integer, Boolean> pair2 = new Pair<>(20, true);
        System.out.println(pair2.getFirstElement());
        System.out.println(pair2.getSecondElement());


    }

    public static <T> void printArray(T[] elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }






}
