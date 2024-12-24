package Array;

import java.util.Scanner;

public class ToggleBulb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bulbs: ");
        int s = sc.nextInt();
        int arr[] = new int[s];

        for (int i = 0; i < s; i++) {
            int c=0;
            for (int j = c+i; j < s; j=j+i+1) {
                if (i == 0) {
                    arr[j] = 1;
                } else {
                    if (arr[j] == 1) {
                        arr[j] = 0;
                    } else {
                        arr[j] = 1;
                    }
                    // j = j + i;
                }
            }
        }
        System.out.println();
        for (int k = 0; k < s; k++) {
            System.out.print(arr[k]);
        }
    }
}
