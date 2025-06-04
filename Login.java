import java.io.Console;

public class Login {
    public static void main(String[] args) {
        String correctUsername = "admin";
        String correctPassword = "pass123";
        int attempts = 3;

        Console console = System.console();

        if (console == null) {
            System.out.println("Console not available. Run from terminal.");
            return;
        }

        while (attempts > 0) {
            String username = console.readLine("Enter username: ");
            char[] passwordChars = console.readPassword("Enter password: ");
            String password = new String(passwordChars);

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                attempts--;
                System.out.println("Incorrect credentials. Tries left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Account locked. Try again later.");
        }
    }
}
