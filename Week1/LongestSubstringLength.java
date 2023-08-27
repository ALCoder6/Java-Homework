import java.util.*;

public class LongestSubstringLength {
    public static int findLongestSubstringLength(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int start = 0;

        for (int end = 0; end < str.length(); end++) {
            char currentChar = str.charAt(end);

            if (charMap.containsKey(currentChar)) {
                start = Math.max(start, charMap.get(currentChar) + 1);
            }

            charMap.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "applesauce";
        int longestLength = findLongestSubstringLength(input);
        System.out.println("Length of the longest substring without repeating characters: " + longestLength);
    }
}