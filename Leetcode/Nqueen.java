import java.util.*;

public class Nqueen {

    public static boolean check(int[][] board, int row, int col) {

        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }

        int b = col - 1;
        for (int i = row - 1; i >= 0; i--) {
            if (b >= 0 && board[i][b--] == 1)
                return false;
        }

        int k = col + 1;
        for (int i = row - 1; i >= 0; i--) {
            if (k < board.length && board[i][k++] == 1)
                return false;
        }

        return true;
    }

    public static void print(int[][] board, List<List<String>> ans) {
        List<String> s = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder ss = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    ss.append("Q");
                } else {
                    ss.append(".");
                }
            }
            s.add(ss.toString());
        }
        ans.add(new ArrayList<>(s));
    }

    public static void solve(int[][] board, int row, List<List<String>> ans) {
        if (row >= board.length) {
            print(board, ans);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (check(board, row, i)) {
                board[row][i] = 1;
                solve(board, row + 1, ans);
                board[row][i] = 0;
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        int[][] board = new int[n][n];
        solve(board, 0, ans);
        return ans;
    }

    public static void main(String[] args) {
        int n = 8;
        List<List<String>> solutions = solveNQueens(n);

        System.out.println("Number of solutions: " + solutions.size());
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
