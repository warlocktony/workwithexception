public class Main {
    public static void main(String[] args) {
        try {
            LoginPassword.enterLoginPassword("1234", "123", "123");
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

    }
}