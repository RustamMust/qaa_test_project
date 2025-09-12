package practice_5.homework.task_1;

public class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Птица чирикает");
    }

    @Override
    void move() {
        System.out.println("Птица летает");
    }
}
