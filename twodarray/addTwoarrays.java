// package twodarray;

import java.util.Scanner;
public class addTwoarrays {
    public static void main(String args[]) {
        
        try (Scanner sc = new Scanner(System.in)) { 
            System.out.print("Enter rows: ");
            int a = sc.nextInt();
            System.out.println();

            System.out.print("Enter cols: ");
            int b = sc.nextInt();
            System.out.println();

            System.out.print("Enter ele for first array: ");
            System.out.println();

            
            int[][] arr1 = new int[a][b];
            int[][] arr2 = new int[a][b];

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }

            System.out.print("Enter ele for second array: ");
            System.out.println();
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }
        }
    }
}
