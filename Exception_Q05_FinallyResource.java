public class Exception_Q05_FinallyResource {
    public static void main(String[] args) {
        System.out.println("File opened");
        try {
            System.out.println("Performing operation...");
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred during the operation.");
        } finally {
            System.out.println("Resource closed");
        }
    }
}
