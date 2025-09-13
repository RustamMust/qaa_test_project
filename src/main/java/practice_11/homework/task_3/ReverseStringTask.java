package practice_11.homework.task_3;

public class ReverseStringTask {
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
}
