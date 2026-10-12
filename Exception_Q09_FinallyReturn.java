public class Exception_Q09_FinallyReturn {
    static int getValue() {
        try {
            System.out.println("Inside try: preparing return value");
            return 10;
        } finally {
            System.out.println("Inside finally: runs before the method returns");
        }
    }

    public static void main(String[] args) {
        int value = getValue();
        System.out.println("Returned value: " + value);
    }
}
