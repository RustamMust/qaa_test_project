package practice_9.lambda;

public class Main {
    public static void main(String[] args) {
        // анонимный класс (к классу нельзя обратиться по имени)
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, world!");
            }
        };

        r1.run();

        Runnable r2 = () -> System.out.println("Hello, world!");

        r2.run();
    }
}
