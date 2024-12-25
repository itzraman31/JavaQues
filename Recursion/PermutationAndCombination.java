import java.util.*;

public class PermutationAndCombination {

    public static void solve(String s, int ind, StringBuilder str, List<String> res) {
        if (ind >= s.length()) {
            res.add(str.toString());
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String: ");
        String s = sc.nextLine();

        StringBuilder str = new StringBuilder("");
        List<String> res = new ArrayList<>();
        solve(s, 0, str, res);

        System.out.println();
        for (String i : res) {
            System.out.print(i + " ");
        }
    }
}
