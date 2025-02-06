import java.util.*;

public class BinarySearch {
    public static boolean solve(int[] arr,int ind){
        if(ind>=arr.length-1){
            return true;
        }

        if(arr[ind]>arr[ind+1])return false;
        if(solve(arr, ind+1)==false) return false;
        return true;
    }
    public static void main(String[] args) {

        int arr[]={3};
        // int arr[]={3,5,2,1,4,6,8};
        // int arr[]={3,4,5,6,7,8};
        System.out.println(solve(arr,0));
    }    
}
