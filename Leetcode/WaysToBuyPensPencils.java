import java.util.*;

class WaysToBuyPensPencils {
    public static long WaysToBuyPensPencils(int total, int cost1, int cost2) {
        long count = 0;
        for (int i = 0; i <= (total / cost1); i++) {
            count += (total - (i * cost1)) / cost2 + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 10;
        int cost1 = 5;
        int cost2 = 2;

        long result = WaysToBuyPensPencils(total, cost1, cost2);
        System.out.println("Number of ways: " + result);
    }
}
