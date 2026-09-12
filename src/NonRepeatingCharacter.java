import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacter {
    public static char findFirstNonRepeatingChar(String text) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String[] inputs = {"swiss", "aabbcc"};
        for (String input : inputs) {
            char result = findFirstNonRepeatingChar(input);
            if (result != '\0') {
                System.out.println("\"" + input + "\" -> First Non-Repeating Character: '" + result + "'");
            } else {
                System.out.println("\"" + input + "\" -> No Non-Repeating Character Found");
            }
        }
    }
}