package practice_5.task_4;

public class Dog extends Pet implements Walkable{
    @Override
    void eat() {
        System.out.println("Собака ест сухой корм");
    }

    @Override
    public void walk() {
        System.out.println("Собака гуляет");
    }
}
