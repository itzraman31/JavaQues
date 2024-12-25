import java.util.*;

public class Subsequences {
    public static void solve(String s, int ind, StringBuilder res, HashSet<String> ans) {
        // System.out.println("JJ");
        if (ind >= s.length()) {
            if (res.length() != 0) {
                ans.add(res.toString());
            }
            return;
        }

        // exclude
        solve(s, ind + 1, res, ans);

        // include
        char str = s.charAt(ind);
        res.append(str);
        solve(s, ind + 1, res, ans);
        res.deleteCharAt(res.length() - 1);

        return;
    }

    public static int solve2(String s, int ind, StringBuilder res, HashSet<String> ans) {
        if (ind >= s.length()) {
            if (res.length() != 0 && ans.contains(res.toString()) == true) {
                return res.length();
            }
            return 0;
        }

        int maxi = Integer.MIN_VALUE;

        // exclude
        int aa = solve2(s, ind + 1, res, ans);

        maxi = Math.max(maxi, aa);

        // include
        char str = s.charAt(ind);
        res.append(str);
        aa = solve2(s, ind + 1, res, ans);
        res.deleteCharAt(res.length() - 1);

        maxi = Math.max(maxi, aa);
        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Can take user input too

        String s1 = "abc";
        String s2 = "def";

        HashSet<String> ans = new HashSet<>();
        StringBuilder res1 = new StringBuilder("");
        StringBuilder res2 = new StringBuilder("");

        solve(s1, 0, res1, ans);
        System.out.print(solve2(s2, 0, res2, ans));
    }
}
