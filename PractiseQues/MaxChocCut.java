
// package Justprac;
import java.util.*;

public class MaxChocCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Atleast left amount would be: ");
        int a = sc.nextInt();

        int arr[] = { 30, 25, 22, 17, 20 };

        int ele = 0;
        Arrays.sort(arr);

        int count = 0;
        for (int i = 1; i < arr[arr.length - 1]; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                count++;
                int d = arr[j] - i;
                if (d > 0) {
                    sum = sum + (d);
                }
                if (sum >= a) {
                    break;
                }
            }
            count++;

            if (sum >= a) {
                ele = i;
            } else {
                break;
            }
        }

        System.out.println("Maximum height is: " + count);
    }
}
