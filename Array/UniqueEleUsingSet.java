// package Array;

import java.util.HashSet;
import java.util.Set;

public class UniqueEleUsingSet {
    public static void main(String[] args) {
        int arr[]={2,4,4,4,1,78,6,5,4,8,7};

        Set<Integer> s=new HashSet<>();

        for(int i=0; i<arr.length; i++)
        {
            s.add(arr[i]);
        }
        // System.out.println(s);
        for(int i=0; i<s.size(); i++)
        {
            System.out.print(s.hashCode()+" ");
        }

    }
}
