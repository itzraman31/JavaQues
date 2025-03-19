import java.util.*;

class MaxRect {
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

    public static int solve(int heights[], int n) {
        List<Integer> right = solveright(heights, n);
        List<Integer> left = solveleft(heights, n);
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            if (right.get(i) == -1) right.set(i, n);
            ans = Math.max(ans, heights[i] * (right.get(i) - left.get(i) - 1));
        }
        return ans;
    }

    public static int maximalRectangle(char[][] matrix) {
        int c = matrix[0].length, r = matrix.length;
        int[][] intMatrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                intMatrix[i][j] = matrix[i][j] - '0';
            }
        }
        int area = solve(intMatrix[0], c);
        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                intMatrix[i][j] = intMatrix[i][j] == 1 ? intMatrix[i][j] + intMatrix[i - 1][j] : 0;
            }
            area = Math.max(area, solve(intMatrix[i], c));
        }
        return area;
    }

    public static void main(String[] args) {
        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        System.out.println(maximalRectangle(matrix));
    }
}
