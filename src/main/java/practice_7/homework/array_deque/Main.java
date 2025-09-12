package practice_7.homework.array_deque;

public class Main {
    public static void main(String[] args) {
        ElementsInDeque elements = new ElementsInDeque();
        elements.addElement(12);
        elements.addElement(1);
        elements.addElement(23);
        elements.addElement(34);
        elements.addElement(543);

        elements.printElements();


        ElementsInStack elementsInStack = new ElementsInStack();
        elementsInStack.addElement(1);
        elementsInStack.addElement(2);
        elementsInStack.addElement(3);
        elementsInStack.addElement(4);
        elementsInStack.addElement(10);
        elementsInStack.addElement(20);

        elementsInStack.printElements();


        ElementsInQueue elementsInQueue = new ElementsInQueue();
        elementsInQueue.addElementToStart(1);
        elementsInQueue.addElementToEnd(50);
        elementsInQueue.addElementToEnd(45);
        elementsInQueue.addElementToStart(2);
        elementsInQueue.addElementToStart(3);
        elementsInQueue.addElementToEnd(65);

        elementsInQueue.removeFirstElement();
        elementsInQueue.removeFirstElement();
        elementsInQueue.removeLastElement();
        elementsInQueue.removeLastElement();
    }
}
