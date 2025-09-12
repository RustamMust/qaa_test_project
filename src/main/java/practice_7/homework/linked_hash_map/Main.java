package practice_7.homework.linked_hash_map;

public class Main {
    public static void main(String[] args) {
        AddElementsToMap addElementsToMap = new AddElementsToMap();
        addElementsToMap.addElements("Kolya", 1);
        addElementsToMap.addElements("Petya", 5);
        addElementsToMap.addElements("Alex", 10);
        addElementsToMap.addElements("Rustam", 20);
        addElementsToMap.addElements("Slava", 27);

        addElementsToMap.printElements();

        ContactBook contactBook = new ContactBook();
        contactBook.addContact("Kolya", 134323);
        contactBook.addContact("Petya", 42234323);

        contactBook.findContact("Kolya");
        contactBook.findContact("Rustam");

        HistoryPages historyPages = new HistoryPages();
        historyPages.addPageToHistory("Page1", 1);
        historyPages.addPageToHistory("Page2", 2);
        historyPages.addPageToHistory("Page3", 3);
        historyPages.addPageToHistory("Page4", 4);
        historyPages.addPageToHistory("Page5", 5);
        historyPages.addPageToHistory("Page6", 6);
        historyPages.addPageToHistory("Page7", 7);
        historyPages.addPageToHistory("Page8", 8);
        historyPages.addPageToHistory("Page9", 9);
        historyPages.addPageToHistory("Page10", 10);

        historyPages.printHistory();
        historyPages.addPageToHistory("Page11", 11);
        historyPages.printHistory();
        historyPages.addPageToHistory("Page12", 12);

        historyPages.printHistory();
    }
}
