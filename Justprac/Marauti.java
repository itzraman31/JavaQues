import java.util.*;

public class Marauti{
    public static int solve(int n,int res){
        if(n<=0){
            return res;
        }
        int dig=n%10;
        if(dig%2==0)
        {
            res=res*10+dig;   
        }
        n=n/10;
        int ans= solve(n,res);
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       System.out.print(solve(n,0));
        return;
    }
}


// static int getPairsCount(int arr[], int n, int k) {
//     HashMap<Integer, Integer> mp = new HashMap<>();
//     int count = 0;
//     for (int i = 0; i < n; i++) {
//         int d = k - arr[i];
//         if (mp.containsKey(d)) {
//             count = count+mp.get(d);
//         }
//         int c= mp.getOrDefault(arr[i], 0);
//         mp.put(arr[i], c+ 1);
//     }
//     return count;
// }
