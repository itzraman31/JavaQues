// package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Your String: ");
            String s=sc.nextLine();

            String n="";
            for(int i=s.length()-1; i>=0; i--)
            {
                n=n+s.charAt(i);
            }

            char[] arr=s.toCharArray();
            Arrays.sort(arr);

            System.out.println("Before Reversing but after sorting :");
            for(int i=0; i<arr.length; i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            System.out.println("Before Reversing but after sorting:");
            for(int i=0; i<arr.length/2; i++)
            {
                char d=arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=d;
            }
            for(int i=0; i<arr.length; i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
