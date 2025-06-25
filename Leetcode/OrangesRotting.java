import java.util.*;

public class OrangesRotting {

    static int checkAdj(int[][] grid, int indi, int indy, List<List<Integer>> newind) {
        int r = grid.length;
        int c = grid[0].length;
        List<Integer> ind1 = new ArrayList<>();
        int count = 0;
        if ((indi < r && indy + 1 < c) && grid[indi][indy + 1] == 1) {
            ind1.add(indi);
            ind1.add(indy + 1);
            newind.add(new ArrayList<>(ind1));
            ind1.clear();
            grid[indi][indy + 1] = 2;
            count++;
        }
        if ((indi < r && (indy - 1) >= 0) && grid[indi][indy - 1] == 1) {
            ind1.add(indi);
            ind1.add(indy - 1);
            newind.add(new ArrayList<>(ind1));
            ind1.clear();
            grid[indi][indy - 1] = 2;
            count++;
        }
        if ((indi - 1 >= 0 && indy < c) && grid[indi - 1][indy] == 1) {
            ind1.add(indi - 1);
            ind1.add(indy);
            newind.add(new ArrayList<>(ind1));
            ind1.clear();
            grid[indi - 1][indy] = 2;
            count++;
        }
        if ((indi + 1 < r && indy < c) && grid[indi + 1][indy] == 1) {
            ind1.add(indi + 1);
            ind1.add(indy);
            newind.add(new ArrayList<>(ind1));
            ind1.clear();
            grid[indi + 1][indy] = 2;
            count++;
        }
        return count;
    }

    public static int orangesRotting(int[][] grid) {
        ArrayList<Integer> res = new ArrayList<>();
        List<List<Integer>> ind = new ArrayList<>();
        int count = 0;
        int min = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    res.add(i);
                    res.add(j);
                    ind.add(new ArrayList<>(res));
                    res.clear();
                }
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        boolean b = true;
        while (b) {
            List<List<Integer>> newind = new ArrayList<>();
            for (int i = 0; i < ind.size(); i++) {
                System.out.print(ind.get(i).get(0) + "  " + ind.get(i).get(1) + "  ");
                int rotten = checkAdj(grid, ind.get(i).get(0), ind.get(i).get(1), newind);
                count = count - rotten;
            }
            ind.clear();
            for (List<Integer> innerList : newind) {
                ind.add(new ArrayList<>(innerList));
            }
            if (newind.size() == 0) {
                b = false;
            } else {
                min++;
            }
        }
        if (count != 0) return -1;
        return min;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };
        int result = orangesRotting(grid);
        System.out.println("\n" + result);
    }
}
