package practice_11.homework.task_18;

public class GcdTask {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
