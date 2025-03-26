import java.util.*;

public class Sudoko {
    public static boolean isSafe(char board[][], int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == c) {
                return false;
            }
            if (board[i][col] == c)
                return false;

            if (board[(3 * (row / 3) + i / 3)][(3 * (col / 3) + i % 3)] == c)
                return false;
        }
        return true;
    }

    public static boolean solve(char board[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char cc = '1'; cc <= '9'; cc++) {
                        if (isSafe(board, i, j, cc)) {
                            board[i][j] = cc;
                            if (solve(board))
                                return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args)

    {
        char board[][] = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        solve(board);

        for (char arr[] : board) {
            for (char c : arr) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}
