import java.util.*;

public class MaxVowels {
    
    public static int freq(Map<Character, Integer> mp) {
        int cnt = 0;
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        for (char ch : mp.keySet()) {
            if (set.contains(ch)) {
                int fre = mp.get(ch);
                cnt += fre;
            }
        }
        return cnt;
    }

    public static int maxVowels(String s, int k) {
        int ans = 0;
        Map<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        int b = freq(mp);
        if (b > ans) {
            ans = b;
        }

        int j = 0;
        for (int i = k; i < s.length(); i++) {
            char chh = s.charAt(j);
            int fre = mp.get(chh);
            mp.put(chh, fre - 1);
            j++;
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            int a = freq(mp);
            if (a > ans) {
                ans = a;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));  // Output should be the maximum number of vowels in a substring of length k
    }
}
