import java.io.Console;

public class LoginSystem {
    private static final String VALID_USER = "admin";
    private static final String VALID_PASS = "1234";

    public boolean authenticate() {
        Console console = System.console();
        
        // Security Check: Console might be null in some IDE runners
        if (console == null) {
            System.out.println("Error: Console not available. Please run this in a real terminal.");
            return false;
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nLogin Attempt " + i + " of 3");
            System.out.print("Enter Username: ");
            String username = console.readLine();

            System.out.print("Enter Password: ");
            // readPassword() masks input automatically in the terminal
            char[] passwordChars = console.readPassword();
            String password = new String(passwordChars);

            if (username.equals(VALID_USER) && password.equals(VALID_PASS)) {
                return true;
            } else {
                System.out.println("Incorrect credentials.");
            }
        }
        return false;
    }
}