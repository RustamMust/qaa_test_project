package practice_7.homework.hash_map;

public class Main {
    public static void main(String[] args) {
        NameAge nameAge = new NameAge();
        nameAge.addNameAgeToMap("Kolya", 15);
        nameAge.addNameAgeToMap("Tolya", 10);
        nameAge.addNameAgeToMap("Petya", 20);
        nameAge.addNameAgeToMap("Semen", 21);
        nameAge.addNameAgeToMap("Andrei", 18);

        nameAge.printMap();



        NameInMap nameInMap = new NameInMap();
        nameInMap.addNameAgeToMap("Kolya", 15);
        nameInMap.addNameAgeToMap("Tolya", 10);
        nameInMap.addNameAgeToMap("Petya", 20);

        nameInMap.printContainsNameInMap("Kolya");
        nameInMap.printContainsNameInMap("Rustam");

        UsersLessThan usersLessThan = new UsersLessThan();
        usersLessThan.addNameAgeToMap("Kolya", 15);
        usersLessThan.addNameAgeToMap("Tolya", 40);
        usersLessThan.addNameAgeToMap("Petya", 50);
        usersLessThan.addNameAgeToMap("Rustam", 25);
        usersLessThan.addNameAgeToMap("Alex", 17);

        usersLessThan.printUnderage();
    }
}
