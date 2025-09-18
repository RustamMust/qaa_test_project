package complex_tasks.homework.task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {
    UserValidator userValidator = new UserValidator();

    @Test
    public void validUserTest() {
        User user = new User("Kolya", 25, "kolya@gmail.com");

        assertDoesNotThrow(() -> userValidator.validate(user));
    }

    @Test
    public void inValidUserNameWithLowFirstCharTest() {
        User user = new User("kolya", 25, "kolya@gmail.com");

        assertThrows(InvalidUserException.class, () -> userValidator.validate(user));
    }

    @Test
    public void inValidNullUserNameTest() {
        User user = new User(null, 25, "kolya@gmail.com");

        assertThrows(InvalidUserException.class, () -> userValidator.validate(user));
    }

    @Test
    public void inValidEmptyUserNameTest() {
        User user = new User("", 25, "kolya@gmail.com");

        assertThrows(InvalidUserException.class, () -> userValidator.validate(user));
    }

    @Test
    public void inValidUserLowAgeTest() {
        User user = new User("kolya", 15, "kolya@gmail.com");

        assertThrows(InvalidUserException.class, () -> userValidator.validate(user));
    }

    @Test
    public void inValidUserHighAgeTest() {
        User user = new User("kolya", 120, "kolya@gmail.com");

        assertThrows(InvalidUserException.class, () -> userValidator.validate(user));
    }

    @Test
    public void inValidUserEmailTest() {
        User user = new User("kolya", 15, "kolya");

        assertThrows(InvalidUserException.class, () -> userValidator.validate(user));
    }

    @Test
    public void inValidUserWithDisabledValidationTest() {
        UserValidator.validationEnabled = false;

        User user = new User("Kolya", 25, "kolya");

        assertDoesNotThrow(() -> userValidator.validate(user));

        UserValidator.validationEnabled = true;
    }
}
