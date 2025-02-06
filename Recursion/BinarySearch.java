import java.util.*;

public class BinarySearch {
    public static boolean solve(int arr[],int s,int e,int k){
        if(e>s) return false;
        
        int mid=(s+e)/2;
        if(arr[mid]==k) return true;
        else if(arr[mid]>k)e=mid;
        else s=mid;

        if(solve(arr, s, e, k)==true) return true;
        return false;
    }
    public static void main(String[] args) {
        int k=4;
        int arr[]={2,3,4,5,6,7};

        System.out.print(solve(arr,0,arr.length-1,k));
    }
}
