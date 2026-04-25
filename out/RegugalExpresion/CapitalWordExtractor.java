import java.util.regex.*;
import java.util.*;

public class CapitalWordExtractor {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        List<String> words = extractCapitalizedWords(text);

        for (String word : words) {
            System.out.print(word + ", ");
        }
    }

    public static List<String> extractCapitalizedWords(String text) {
        List<String> result = new ArrayList<>();

        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            result.add(matcher.group());
        }

        return result;
    }
}