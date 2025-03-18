import java.util.*;

class Largestrectanglearea {
    public static List<Integer> solveright(int[] heights, int n) {
        Stack<Integer> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        st.push(-1);
        for (int i = n - 1; i >= 0; i--) {
            while (st.peek() != -1 && heights[i] < heights[st.peek()]) {
                st.pop();
            }
            ans.add(st.peek());
            st.push(i);
        }
        Collections.reverse(ans);
        return ans;
    }

    public static List<Integer> solveleft(int[] a, int n) {
        Stack<Integer> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        st.push(-1);
        for (int i = 0; i < n; i++) {
            while (st.peek() != -1 && a[st.peek()] >= a[i]) {
                st.pop();
            }
            ans.add(st.peek());
            st.push(i);
        }
        return ans;
    }

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        List<Integer> right = solveright(heights, n);
        List<Integer> left = solveleft(heights, n);

        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (right.get(i) == -1) {
                right.set(i, n);
            }
            int area = heights[i] * (right.get(i) - left.get(i) - 1);
            ans = Math.max(ans, area);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights));
    }
}
