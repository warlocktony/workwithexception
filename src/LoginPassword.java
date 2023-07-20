import java.util.regex.Pattern;

public class LoginPassword {

    private static final Pattern REGEX = Pattern.compile("^[A-Za-z0-9_]{1,20}$");

    public static void enterLoginPassword(String login, String password, String confirmPassword)
            throws WrongPasswordException, WrongLoginException {
        checkLogin(login);
        checkPassword(password);
        checkConfirmPassword(password, confirmPassword);

    }

    private static void checkLogin(String login) throws WrongLoginException {

        if (!login.matches(REGEX.pattern())) {
            throw new WrongLoginException
                    ("In login allowed only Latin symbols,numbers and _ or your login is more twenty symbols");
        }
    }

    private static void checkPassword(String password) throws WrongPasswordException {
        if (!password.matches(REGEX.pattern())) {
            throw new WrongPasswordException
                    ("In password allowed only Latin symbols,numbers and _ or your password is more twenty symbols");
        }

    }

    private static void checkConfirmPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Your password and confirmPassword not equals!");
        }

    }
}
