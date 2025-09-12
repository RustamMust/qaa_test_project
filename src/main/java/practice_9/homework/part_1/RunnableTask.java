package practice_9.homework.part_1;

public class RunnableTask {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        r1.run();
    }
}

