package practice_5.homework.task_8;

public class Museum {
    private Exhibit exhibit;

    public void addExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
        System.out.println("Экспонат добавлен в музей");
    }

    public void showExhibit() {
        this.exhibit.describe();
        this.exhibit.preserve();
    }
}
