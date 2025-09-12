package practice_5.homework.task_8;

public class Manuscript extends Exhibit {
    @Override
    void describe() {
        System.out.println("Древний текст.");
    }

    @Override
    void preserve() {
        System.out.println("Контролируемая влажность.");
    }
}
