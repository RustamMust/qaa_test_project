package complex_tasks.homework.task_2;

import java.util.regex.Pattern;

public class UserValidator {
    public static boolean validationEnabled = true;

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    public void validate(User user) {
        if (!validationEnabled) {
            System.out.println("Валидация отключена.");
            return;
        }

        if (user.getName() == null || user.getName().isEmpty()) {
            throw new InvalidUserException("Имя должно быть непустым.");
        }

        if (!Character.isUpperCase(user.getName().charAt(0))) {
            throw new InvalidUserException("Имя должно начинаться с заглавной буквы.");
        }

        if (user.getAge() < 18 || user.getAge() > 100) {
            throw new InvalidUserException("Возраст пользователя должен быть в пределах от 18 до 100 лет.");
        }

        if (user.getEmail() == null || !EMAIL_PATTERN.matcher(user.getEmail()).matches()) {
            throw new InvalidUserException("Неправильный email.");
        }
    }
}
