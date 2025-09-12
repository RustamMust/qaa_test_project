package practice_5.homework.task_8;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();

        Manuscript manuscript1 = new Manuscript();
        Sculpture sculpture1 = new Sculpture();

        museum.addExhibit(manuscript1);
        museum.showExhibit();

        museum.addExhibit(sculpture1);
        museum.showExhibit();
    }
}
