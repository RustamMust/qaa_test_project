package practice_4.solvers;

import practice_4.Season;

public class SwitchTaskSolver {
    public String dayOfWeek(int day) {
        String dayOfWeek = "";

        switch (day) {
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek = "Несуществующий день недели";

        }

        return dayOfWeek;
    }

    public String describeSeason(Season season) {
        String description = "";
        switch (season) {
            case WINTER -> description = "Зима - холодно и снежно.";
            case SUMMER -> description = "Лето - жарко.";
            case AUTUMN -> description = "Весна - все цветет.";
            case SPRING -> description = "Осень - много листьев.";

        }
        return description;
    }
}
