// package Array;

import java.util.*;

public class reverse {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array: ");
            int a = sc.nextInt();

            int arr[] = new int[a];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println();
            System.out.println();

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            System.out.println();

            for (int i = 0; i < arr.length / 2; i++) {
                int t = arr[i];
                arr[i] = arr[a - 1 - i];
                arr[a - 1 - i] = t;
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
