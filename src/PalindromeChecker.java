public class PalindromeChecker {
    public static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text == null || text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] chars = text.toCharArray();
        char[] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[chars.length - 1 - i];
        }
        return text.equals(new String(reversed));
    }

    public static void main(String[] args) {
        String[] testCases = {"madam", "hello"};
        for (String test : testCases) {
            boolean iter = isPalindromeIterative(test);
            boolean rec = isPalindromeRecursive(test);
            boolean arr = isPalindromeArrayReversal(test);

            System.out.println("\"" + test + "\"");
            System.out.println("Iterative: " + (iter ? "Palindrome" : "Not Palindrome") +
                    " | Recursive: " + (rec ? "Palindrome" : "Not Palindrome") +
                    " | Array Reversal: " + (arr ? "Palindrome" : "Not Palindrome"));
            System.out.println();
        }
    }
}