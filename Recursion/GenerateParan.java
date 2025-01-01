import java.util.*;

public class GenerateParan {

    public static boolean valid(String s) {
        Stack<Character> st = new Stack<>();

        if (s.charAt(0) == ')')
            return false;
        if (s.charAt(s.length() - 1) == '(')
            return false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.add(s.charAt(i));
            } else {
                if (!st.empty()) {
                    char c = st.peek();
                    st.pop();
                    if (c == s.charAt(i))
                        return false;
                } else {
                    return false;
                }
            }
        }

        if (!st.empty())
            return false;
        return true;
    }

    public static void solve(int n, StringBuilder s, List<String> ans,int dp1[]) {
        if (s.length() == n * 2) {
            if(valid(s.toString())==true){
                // System.out.println(s);
                ans.add(s.toString());
            }
            return;
        }

        System.out.println(1);
        
        if(dp1[0]>n*2) return;
        if(dp1[1]>n*2) return;

        s.append("(");
        dp1[0]=dp1[0]+1;
        solve(n, s, ans,dp1);
        dp1[0]=dp1[0]-1;
        s.deleteCharAt(s.length() - 1);
        
        s.append(")");
        dp1[1]=dp1[1]+1;
        solve(n, s, ans,dp1);
        dp1[1]=dp1[1]-1;
        
        s.deleteCharAt(s.length() - 1);
    }
    
    public static void main(String[] args) {
        int dp1[]=new int[2];

        List<String> ans = new ArrayList<>();
        StringBuilder s = new StringBuilder("");
        
        solve(3, s, ans,dp1);
    }
}
