package practice_7.homework.array_list;

import java.util.ArrayList;

public class LongestString {
    ArrayList<String> listLongestString;

    public LongestString() {
        this.listLongestString = new ArrayList<>();
    }

    public void addStringToList(String newString) {
        listLongestString.add(newString);
    }

    String longestStringFromList = "";

    public void printLongestStringFromList() {
        listLongestString.forEach(
                currentString -> {
                    if (currentString.length() > longestStringFromList.length()) {
                        longestStringFromList = currentString;
                    }
                }
        );
        System.out.println("Longest string: " + longestStringFromList);
    }
}
