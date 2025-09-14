package practice_11.homework.task_9;

public class CountWordsInStringTask {
    public int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }
}
