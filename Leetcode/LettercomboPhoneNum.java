import java.util.ArrayList;
import java.util.List;

public class LettercomboPhoneNum {

    public static void solve(String digits, int ind, StringBuilder str, String map[], List<String> res) {
        if (ind >= digits.length()) {
            if (str.length() > 0) {
                res.add(str.toString());
                return;
            }
        }

        int dig = digits.charAt(ind) - '0';
        String digmap = map[dig];

        for (int i = 0; i < digmap.length(); i++) {
            str.append(digmap.charAt(i));
            solve(digits, ind + 1, str, map, res);
            str.deleteCharAt(str.length() - 1);
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        StringBuilder str = new StringBuilder("");
        String map[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        if (digits.length() == 0) return res;
        solve(digits, 0, str, map, res);
        return res;
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> result = letterCombinations(digits);
        System.out.println(result);
    }
}
