import java.util.*;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> mp = new TreeMap<>();

        if (s.length() != t.length()) {
            System.out.print(s.length());
            System.out.print(t.length());
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                mp.put(s.charAt(i), 0);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                int d = mp.get(s.charAt(i)) + 1;
                mp.put(s.charAt(i), d);
            }
        }

        Map<Character, Integer> mp1 = new TreeMap<>();

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != ' ') {
                mp1.put(t.charAt(i), 0);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != ' ') {
                int d = mp1.get(t.charAt(i)) + 1;
                mp1.put(t.charAt(i), d);
            }
        }

        if (mp.equals(mp1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }
}
