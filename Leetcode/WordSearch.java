import java.util.*;

class WordSearch {
    public static boolean solve(int r, int c, char[][] board, int ind, String word, boolean vis[][]) {
        if (ind >= word.length())
            return true;
        if (r >= board.length || r < 0 || c >= board[0].length || c < 0 || vis[r][c] || board[r][c] != word.charAt(ind))
            return false;
        vis[r][c] = true;
        boolean ans = solve(r, c + 1, board, ind + 1, word, vis) ||
                      solve(r + 1, c, board, ind + 1, word, vis) ||
                      solve(r, c - 1, board, ind + 1, word, vis) ||
                      solve(r - 1, c, board, ind + 1, word, vis);
        vis[r][c] = false;
        return ans;
    }

    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean vis[][] = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (solve(i, j, board, 0, word, vis))
                        return true;
                }
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
}
