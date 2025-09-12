package practice_5.homework.task_7;

public class RollerCoaster extends Attraction{
    @Override
    void info() {
        System.out.println("Острые ощущения.");
    }

    @Override
    void maintain() {
        System.out.println("Нужна проверка безопасности.");
    }
}
