package practice_7.homework.linked_hash_map;

import java.util.LinkedHashMap;

public class HistoryPages {
    LinkedHashMap<String, Integer> history;

    public static final int MAX_SIZE = 10;

    public HistoryPages() {
        this.history = new LinkedHashMap<>();
    }

    public void addPageToHistory(String namePage, Integer idPage) {
        history.put(namePage, idPage);

        if (history.size() > MAX_SIZE) {
            String firstKey = history.keySet().iterator().next();
            history.remove(firstKey);
        }
    }

    public void printHistory() {
        System.out.println("Page history: " + history);
    }

}
