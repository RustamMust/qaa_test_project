package practice_5.task_3;

public class Bird extends Animal{
    @Override
    void makeSound() {
        System.out.println("Чирик");
    }

    @Override
    void makeMove() {
        System.out.println("Летать");
    }
}
