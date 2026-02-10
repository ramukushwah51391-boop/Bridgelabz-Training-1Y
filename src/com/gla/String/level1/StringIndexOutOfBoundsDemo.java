public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException() {
        String text = "Java";

        // Invalid index (length is 4, valid index: 0 to 3)
        System.out.println("Character at index 10: " + text.charAt(10));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException() {
        String text = "Java";

        try {
            // Invalid index access
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught and handled!");
            System.out.println("Error message: " + e);
        }
    }

    public static void main(String[] args) {

        System.out.println("Calling method to generate exception:");
        // Uncomment to see exception
        // generateException();

        System.out.println("\nCalling method to handle exception:");
        handleException();
    }
}
