public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;   // initialized to null

        // This will generate NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {
        String text = null;   // initialized to null

        try {
            // This will generate NullPointerException
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught and handled!");
            System.out.println("Error message: " + e);
        }
    }

    public static void main(String[] args) {

        System.out.println("Calling method to generate exception:");
        // This will crash if not commented after testing
        // generateException();

        System.out.println("\nCalling method to handle exception:");
        handleException();
    }
}
