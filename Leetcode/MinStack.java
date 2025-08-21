import java.util.Stack;

public class MinStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static void push(int val) {
        if (s2.isEmpty() || val <= s2.peek()) {
            s2.push(val);
        }
        s1.push(val);
    }

    public static void pop() {
        if (s1.peek().equals(s2.peek())) {
            s2.pop();
        }
        s1.pop();
    }

    public static int top() {
        return s1.peek();
    }

    public static int getMin() {
        return s2.peek();
    }

    public static void main(String[] args) {
        push(5);
        push(3);
        push(7);
        System.out.println(getMin()); // 3
        pop();
        System.out.println(top());    // 3
        System.out.println(getMin()); // 3
        pop();
        System.out.println(getMin()); // 5
    }
}
