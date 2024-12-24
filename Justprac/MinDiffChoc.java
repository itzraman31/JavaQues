// package Justprac;

import java.util.*;

public class MinDiffChoc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter number of students: ");
        // int s=sc.nextInt();

        // System.out.print("Enter size of array: ");
        // int a = sc.nextInt();

        // int arr[] = new int[a];
        int arr[] = {2, 7, 6, 1, 4, 5};
        int a=arr.length;
        int s=3;
        int i=0;

        // System.out.println("Enter elements: ");
        // for (int i = 0; i < a; i++) {
        //     arr[i] = sc.nextInt();
        // }

        Arrays.sort(arr);

        int diff=100;
        int c=0;
        while (i+s<a) {
            c=arr[i-1+s]-arr[i];
            if(diff>c){
                diff=c;
            }
            i++;
        }

        System.out.println("Minimum diff is: "+diff);
    }

}
