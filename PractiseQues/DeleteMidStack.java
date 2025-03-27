import java.util.*;

public class DeleteMidStack {
    public static void print(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void solve(Stack<Integer> s, int size) {
        if (s.size() == size) {
            s.pop();
            return;
        }
        int ele = s.pop();
        solve(s, size);
        s.add(ele);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int arr[] = { 10, 20, 30, 40, 50 };

        for (int i : arr)
            s.add(i);

        int size = s.size();
        size = (size / 2) + 1;

        solve(s, size);
        print(s);
    }
}
