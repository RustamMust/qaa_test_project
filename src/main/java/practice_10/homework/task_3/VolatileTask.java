package practice_10.homework.task_3;

public class VolatileTask {
    private static volatile boolean stop = false;

    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            while (!stop) {
                count++;
            }
            System.out.println("Count: " + count);
        });

        worker.start();

        Thread.sleep(2000);

        System.out.println("Основной поток устанавливает stop=true.");
        stop = true;

        worker.join();
        System.out.println("Завершение основного потока.");



    }

}
