import java.util.*;

public class NumberOfSubstrings {
    public static int numberOfSubstrings(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            mp.put(c, i);
            if (mp.size() == 3) {
                int min = Math.min(mp.get('a'), Math.min(mp.get('b'), mp.get('c')));
                count = count + min + 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "abcabc";
        int result = numberOfSubstrings(s);
        System.out.println(result);
    }
}
