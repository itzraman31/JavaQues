import java.util.*;

public class CharacterReplacement {
    public static int characterReplacement(String s, int k) {
        Map<Character, Integer> mp = new HashMap<>();
        int max = 0;
        int p = 0;
        int maxfreq = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
            maxfreq = Math.max(maxfreq, mp.get(c));

            while ((i - p + 1) - maxfreq > k) {
                char l = s.charAt(p);
                mp.put(l, mp.get(l) - 1);
                p++;
            }

            max = Math.max(max, i - p + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }
}
