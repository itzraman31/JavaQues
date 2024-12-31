import java.util.*;

public class GenerateParan {

    public static void solve(int n, int st, int en, StringBuilder s, List<String> ans) {
        if ((n * 2) / 2 - 1 == en) {
            return;
        }
        System.out.println(st + " " + en);
        StringBuilder res = new StringBuilder(s);
        int index1 = st;
        int index2 = en;

        char char1 = res.charAt(index1);
        char char2 = res.charAt(index2);

        res.setCharAt(index1, char2);
        res.setCharAt(index2, char1);

        // System.out.print(res+" ");
        ans.add(res.toString());
        // for(int i=st; i<=n/2+1; i++){

        solve(n, st + 1, en - 1, s, ans);
        // }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder s = new StringBuilder("");

        for (int i = 0; i < n * 2; i++) {
            if (i < n * 2 / 2) {
                s.append("(");
            } else {
                s.append(")");
            }
        }

        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = s.length()-2; j >0; j--) {
                StringBuilder res = new StringBuilder(s);

                int index1 = i;
                int index2 = j;
        
                char char1 = s.charAt(index1);
                char char2 = s.charAt(index2);
        
                res.setCharAt(index1, char2);
                res.setCharAt(index2, char1);
        
                System.out.print(res+" ");
            }
        }

        // System.out.println(s+" ");

        // System.out.print(s.charAt(1));
        // System.out.print(s.charAt(n*2-1));
        // System.out.println(s.length());

        // solve(n, 1, s.length() - 2, s, ans);
        return ans;
    }

    public static void main(String[] args) {
        // generateParenthesis(3);
        int n=8;
        List<String> ans = new ArrayList<>();
        StringBuilder s = new StringBuilder("");
        Set<String> st=new HashSet<>();

        for (int i = 0; i < n * 2; i++) {
            if (i < n * 2 / 2) {
                s.append("(");
            } else {
                s.append(")");
            }
        }

        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = s.length()-2; j >0; j--) {
                StringBuilder res = new StringBuilder(s);

                int index1 = i;
                int index2 = j;
        
                char char1 = s.charAt(index1);
                char char2 = s.charAt(index2);
        
                res.setCharAt(index1, char2);
                res.setCharAt(index2, char1);
                
                st.add(res.toString());
            }
        }

        for(String ss:st){
            System.out.println(ss);
        }
    }
}
