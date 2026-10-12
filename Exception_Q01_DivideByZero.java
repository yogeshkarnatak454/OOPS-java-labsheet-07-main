import java.util.Scanner;

public class Exception_Q01_DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();
            System.out.println("Result: " + (numerator / denominator));
        } catch (ArithmeticException e) {
            System.out.println("Error: cannot divide by zero.");
        } finally {
            System.out.println("Division operation finished.");
            sc.close();
        }
    }
}
