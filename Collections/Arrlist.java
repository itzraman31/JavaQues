// package Collections;

import java.util.*;

public class Arrlist {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        int arr1[]={2,2,2};

        System.out.println(arr);        
        // System.out.println(arr.set(0,1));
        // System.out.println(arr.get(0));
        // arr.add(0,3);
        // System.out.println(arr.remove(1));
        arr.remove(Integer.valueOf(1));
        System.out.println(arr);
        
    }
}
