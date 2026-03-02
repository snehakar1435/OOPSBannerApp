import java.util.HashMap;

/**
 * OOPSBannerApp UC8 - Use Map for Character Patterns and Render via Function
 *
 * This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts
 * such as the Collections Framework to manage character patterns in a more flexible
 * and efficient manner. The application retrieves and displays the "OOPS" banner
 * using a HashMap thereby enhancing code organization and modularity.
 *
 * @author Developer
 * @version 8.0
 */
public class OOPSBannerApp {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     * @return a HashMap where keys are characters and values are String arrays
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
            "  ***   ",
            " **  ** ",
            "**    **",
            "**    **",
            "**    **",
            " **  ** ",
            "  ***   "
        });

        charMap.put('P', new String[]{
            " ****** ",
            " **  ** ",
            " **  ** ",
            " ****** ",
            " **     ",
            " **     ",
            " **     "
        });

        charMap.put('S', new String[]{
            " ***** ",
            " **    ",
            " **    ",
            "  **** ",
            "     **",
            "     **",
            " ***** "
        });

        return charMap;
    }

    /**
     * Displays a banner message using the provided character map.
     * @param message the String message to display as a banner
     * @param charMap a HashMap containing character patterns
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        // Outer loop - each line of the banner
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();

            // Inner loop - each character in the message
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                sb.append(pattern[line]).append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    /**
     * Main entry point of the application.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}