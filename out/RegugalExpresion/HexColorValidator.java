public class HexColorValidator {
    public static void main(String[] args) {
        String[] inputs = {"#FFA500", "#ff4500", "#123", "123456", "#GGGGGG"};

        for (String color : inputs) {
            if (isValidHexColor(color)) {
                System.out.println(color + " → Valid");
            } else {
                System.out.println(color + " → Invalid");
            }
        }
    }

    public static boolean isValidHexColor(String color) {
        return color.matches("^#[0-9A-Fa-f]{6}$");
    }
}