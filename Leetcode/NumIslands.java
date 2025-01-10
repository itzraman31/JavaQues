import java.util.*;

class NumIslands {
    public static void check(char[][] grid, int i, int j, int m, int n) {
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        check(grid, i - 1, j, m, n); // Up
        check(grid, i + 1, j, m, n); // Down
        check(grid, i, j - 1, m, n); // Left
        check(grid, i, j + 1, m, n); // Right
    }

    public static int numIslands(char[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    check(grid, i, j, m, n);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Hardcoded grid
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        int result = numIslands(grid);

        System.out.println("Number of islands: " + result);
    }
}
