package Array;

import java.util.*;

class Prefixsum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();

        int arr[]=new int[a];

        for(int i=0; i<a; i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=1; i<a; i++)
        {
            arr[i]=arr[i]+arr[i-1];
        }

        for(int i=0; i<a; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}