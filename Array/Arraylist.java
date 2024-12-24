package Array;
import java.util.*;

public class Arraylist {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
        }

        int arr[]={1,2,3,41,26};

        int copy[]=Arrays.copyOf(arr,arr.length);

        for(int i=0; i<copy.length; i++)
        {
            System.out.print(copy[i]+" ");
        }

        // System.out.print("Enter size of arraylist: ");
        // int a=sc.nextInt();

        // ArrayList<Integer> list=new ArrayList<>();

        // for(int i=1; i<=a; i++)
        // {
        //     int b=sc.nextInt();
        //     list.add(b);
        // }

        // Collections.sort(list);
        // Collections.reverse(list);

        // Collections.sort(list,Collections.reverseOrder());

        // for(int i=0; i<list.size(); i++)
        // {
        //     System.out.print(list.get(i)+" ");
        // }
    }
}

// list.get(i) list.add(value) list.remove(index) list.size() list.set(index,value) 