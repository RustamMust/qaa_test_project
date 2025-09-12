package practice_5.homework.task_7;

public class Main {
    public static void main(String[] args) {
        AmusementPark amusementPark = new AmusementPark();

        RollerCoaster rollerCoaster1 = new RollerCoaster();
        Carousel carousel1 = new Carousel();

        amusementPark.addAttraction(rollerCoaster1);
        amusementPark.operateAttraction();

        amusementPark.addAttraction(carousel1);
        amusementPark.operateAttraction();
    }
}
