import java.util.*;

class FindDifferentBinaryString {
    public static String solve(int len, StringBuilder s, Set<String> ans) {
        if (s.length() == len) {
            if(ans.contains(s.toString())){
                return null;
            } else {
                return s.toString();
            }
        }
        s.append("1");
        String ans1 = solve(len, s, ans);
        s.deleteCharAt(s.length() - 1);
        if(ans1 != null) return ans1;

        s.append("0");
        String ans2 = solve(len, s, ans);
        s.deleteCharAt(s.length() - 1);
        if(ans2 != null) return ans2;

        return ans1;
    }

    public static String findDifferentBinaryString(String[] nums) {
        Set<String> st = new HashSet<>(Arrays.asList(nums));
        StringBuilder str = new StringBuilder("");
        return solve(nums.length, str, st);
    }

    public static void main(String[] args) {
        String[] nums = {"01", "10"};
        System.out.println(findDifferentBinaryString(nums));
    }
}
