public class HasMatch {
    public static int solve(String s, String p, int st) {
        int i = st, j = 0, k = st;
        while (i < s.length()) {
            if (s.charAt(i) == p.charAt(j)) {
                i++;
                j++;
            } else {
                j = 0;
                i = k;
                k++;
            }
            if (j >= p.length()) {
                return i;
            }
        }
        if (j >= p.length()) return i;
        return -1;
    }

    public static boolean hasMatch(String s, String p) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        int ans1 = 0, ans2 = 0;
        while (i < p.length()) {
            if (p.charAt(i) == '*') break;
            res.append(p.charAt(i));
            i++;
        }
        if (res.length() != 0) {
            ans1 = solve(s, res.toString(), 0);
        }
        if (ans1 == -1) return false;

        i++;
        res.setLength(0);
        while (i < p.length()) {
            if (p.charAt(i) == '*') break;
            res.append(p.charAt(i));
            i++;
        }
        if (res.length() != 0) {
            ans2 = solve(s, res.toString(), ans1);
        }
        if (ans2 == -1) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "abcdeabc";
        String p = "abc*abc";
        boolean result = hasMatch(s, p);
        System.out.println(result);
    }
}
