import java.util.*;

class RemoveOuterParentheses {
    public static String removeOuterParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                if (st.size() == 1) {
                    set.add(st.pop());
                    set.add(i);
                } else {
                    st.pop();
                }
            }
        }
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(i)) {
                res += s.charAt(i);
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
}
