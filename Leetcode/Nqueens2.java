public class Nqueens2 {
    public boolean check(int[][] board, int row, int col) {
        for (int i = 0; i < row; i++) { // For above row
            if (board[i][col] == 1)
                return false;
        }
        int b = col - 1;
        for (int i = row - 1; i >= 0; i--) { // For left diagonal
            if (b >= 0) {
                if (board[i][b--] == 1)
                    return false;
            }
        }
        int k = col + 1;
        for (int i = row - 1; i >= 0; i--) { // For right diagonal
            if (k < board.length) {
                if (board[i][k++] == 1)
                    return false;
            }
        }
        return true;
    }

    public void solve(int[][] board, int row, int col, int[] ans) {
        if (row >= board.length) {
            int n = ans[0];
            n = n + 1;
            ans[0] = n;
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (check(board, row, i)) {
                board[row][i] = 1;
                solve(board, row + 1, i, ans);
                board[row][i] = 0;
            }
        }
    }

    public int totalNQueens(int n) {
        int ans[] = new int[1];
        int[][] board = new int[n][n];
        solve(board, 0, 0, ans);
        return ans[0];
    }

    public static void main(String[] args) {
        Nqueens2 nq2 = new Nqueens2();
        int n = 8;
        int totalSolutions = nq2.totalNQueens(n);
        System.out.println("Total number of solutions for " + n + "-Queens: " + totalSolutions);
    }
}
