// package Array;

import java.util.*;

public class WinnerOfGame {
    public static int digsum(int a)
    {
        int sum=0;
        for(int i=a; i>0; i=i/10)
        {
            sum=sum+(i%10);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={ 12, 43, 25, 23, 30 };

        int nums[][]=new int[arr.length][2];

        for(int i=0; i<arr.length; i++)
        {
            nums[i][0]=arr[i];
            nums[i][1]=digsum(arr[i]);
        }
        int sum1=0;
        int sum2=0;
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }


        // int ans=Math.max(sum1,sum2);
        // System.out.println("Answer is: "+ans);
    }
}
