import java.util.*;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        PriorityQueue<Integer> h = new PriorityQueue<>(Collections.reverseOrder());

        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;

        int a = 1, max = 0, j = 0;
        set.add(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                if (a > max) {
                    max = a;
                    h.add(a);
                }
                set.clear();
                a = 1;
                i = j + 1;
                j = i;
                set.add(s.charAt(i));
            } else {
                a++;
                set.add(s.charAt(i));
            }
        }
        h.add(a);
        return h.peek();
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
