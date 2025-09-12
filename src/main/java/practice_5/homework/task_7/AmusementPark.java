package practice_5.homework.task_7;

public class AmusementPark {
    private Attraction attraction;

    public void addAttraction(Attraction attraction) {
        this.attraction = attraction;
        System.out.println("Аттракцион добавлен.");
    }

    public void operateAttraction() {
        this.attraction.info();
        this.attraction.maintain();
    }
}
