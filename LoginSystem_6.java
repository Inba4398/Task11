package Task11;
import java.util.Scanner;
public class LoginSystem_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Get username and password from the user
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            // Validate the user's credentials
            login(username, password);

            // If login is successful, display a welcome message
            System.out.println("Login successful. Welcome, " + username + "!");
        } catch (InvalidCredentialsException e) {
            // If an exception is caught, display an error message
            System.out.println("Login failed. " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }

    // Simulate the login process and throw an exception for invalid credentials
    private static void login(String username, String password) throws InvalidCredentialsException {
        // Replace this logic with your actual authentication mechanism
        String storedPassword = "correctpassword";

        if (!password.equals(storedPassword)) {
            throw new InvalidCredentialsException("Incorrect password");
        }
    }

    // Custom exception class for invalid credentials
    private static class InvalidCredentialsException extends Exception {
        public InvalidCredentialsException(String message) {
            super(message);
        }

	}

}
