import java.util.*;

public class BinarySearch {
    public static boolean solve(int arr[],int s,int e,int k){
        if(s>e) return false;
        
        int mid=(s+e)/2;
        if(arr[mid]==k) return true;
        else if(arr[mid]>k)e=mid-1;
        else s=mid+1;

        if(solve(arr, s, e, k)==true) return true;
        return false;
    }
    public static void main(String[] args) {
        int k=1;
        int arr[]={1,2,3,4,5,6,7};

        System.out.print(solve(arr,0,arr.length-1,k));
    }
}
