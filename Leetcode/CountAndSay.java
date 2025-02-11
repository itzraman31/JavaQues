import java.util.*;

class CountAndSay {
    public static String solve(int n) {
        if (n == 1) return "1";
        String res = solve(n - 1);
        int count = 1;
        String ans = "";
        for (int i = 0; i < res.length(); i++) {
            if (i + 1 < res.length() && res.charAt(i) == res.charAt(i + 1)) {
                count++;
            } else {
                ans += Integer.toString(count) + res.charAt(i);
                count = 1;
            }
        }
        return ans;
    }
    
    public static String countAndSay(int n) {
        return solve(n);
    }
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countAndSay(n));
    }
}
