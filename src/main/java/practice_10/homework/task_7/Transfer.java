package practice_10.homework.task_7;

public class Transfer implements Runnable{
    private final Account from;
    private final Account to;
    private final int amount;

    public Transfer(Account from, Account to, int amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }


    @Override
    public void run() {
        Account first = from.hashCode() < to.hashCode() ? from : to;
        Account second = from.hashCode() < to.hashCode() ? to : from;

        try {
            first.getLock().lock();
            second.getLock().lock();

            if (from.withdraw(amount)) {
                to.deposit(amount);
                System.out.println(Thread.currentThread().getName() +
                        " перевёл " + amount +
                        " со счёта " + from.hashCode() +
                        " на счёт " + to.hashCode());
            } else {
                System.out.println(Thread.currentThread().getName() +
                        " не смог перевести " + amount +
                        " (недостаточно средств)");
            }
        } finally {
            second.getLock().unlock();
            first.getLock().unlock();
        }

    }
}
