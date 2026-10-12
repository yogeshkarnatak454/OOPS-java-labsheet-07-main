import java.util.Scanner;

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}

public class Exception_Q07_CustomPassword {
    static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 6) {
            throw new InvalidPasswordException("Password must contain at least 6 characters.");
        }
        System.out.println("Password accepted.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter password: ");
            validatePassword(sc.nextLine());
        } catch (InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
