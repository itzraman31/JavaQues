public class FindRotation {
    public static void rot(int[][] mat) {
        int mrow = mat.length;
        int mcol = mat[0].length;

        for (int i = 0; i < mrow; i++) {
            for (int j = i; j < mcol; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        int i = 0;
        int j = mcol - 1;

        while (i < j) {
            for (int k = 0; k < mrow; k++) {
                int temp = mat[k][i];
                mat[k][i] = mat[k][j];
                mat[k][j] = temp;
            }
            i++;
            j--;
        }
    }

    public static boolean check(int[][] mat, int[][] target) {
        int mrow = mat.length;
        int mcol = mat[0].length;

        for (int i = 0; i < mrow; i++) {
            for (int j = 0; j < mcol; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        if (check(mat, target)) {
            return true;
        }

        rot(mat);
        if (check(mat, target)) {
            return true;
        }

        rot(mat);
        if (check(mat, target)) {
            return true;
        }

        rot(mat);
        if (check(mat, target)) {
            return true;
        }

        return false;
    }
}
