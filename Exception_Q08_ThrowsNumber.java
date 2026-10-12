import java.util.Scanner;

public class Exception_Q08_ThrowsNumber {
    static int readNumber(Scanner sc) throws NumberFormatException {
        System.out.print("Enter a whole number: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Number: " + readNumber(sc));
        } catch (NumberFormatException e) {
            System.out.println("Error: the input is not a valid integer.");
        } finally {
            sc.close();
        }
    }
}
