import java.util.HashSet;
import java.util.Set;

class LengthSolution {

    // This is the function
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int longestSubstring = 0;
        Set<Character> uniqueChar = new HashSet<>();

        

        while (right < s.length()) {
            if (!uniqueChar.contains(s.charAt(right))) {
                uniqueChar.add(s.charAt(right));
                right++;
                longestSubstring = Math.max(longestSubstring, uniqueChar.size());
            } else {
                uniqueChar.remove(s.charAt(left));
                left++;
            }
        }
        return longestSubstring;
    }
}
