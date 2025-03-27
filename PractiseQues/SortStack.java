import java.util.*;

public class SortStack {
    public static void print(Stack<Integer> st) {
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }

    public static void placeOnRytPlace(Stack<Integer> st, int ele) {
        if (st.isEmpty()) {
            st.add(ele);
            return;
        }

        if (st.peek() < ele) {
            int a = st.pop();
            placeOnRytPlace(st, ele);
            st.add(a);
        } else {
            st.add(ele);
            return;
        }
    }

    public static void solve(Stack<Integer> st) {
        if (st.isEmpty())
            return;

        int ele = st.pop();
        solve(st);
        placeOnRytPlace(st, ele);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int arr[]={-34, 3, 31, -98, 92, -23};
        for(int i:arr){
            st.add(i);
        }

        solve(st);
        print(st);
    }
}
