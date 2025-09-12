package practice_10.homework.task_7;

public class BankTransferTask {
    public static void main(String[] args) throws InterruptedException{
        Account account1 = new Account(1000);
        Account account2 = new Account(1000);

        Thread t1 = new Thread(new Transfer(account1, account2, 300), "T1");
        Thread t2 = new Thread(new Transfer(account2, account1, 500), "T2");
        Thread t3 = new Thread(new Transfer(account1, account2, 700), "T3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Итоговый баланс account1: " + account1.getBalance());
        System.out.println("Итоговый баланс account2: " + account2.getBalance());
    }
}
