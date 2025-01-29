import java.util.*;

public class DecimalToBinary {
    public static void solve(int n,StringBuilder st){
        if(n<=0) return;
        String str1 = Integer.toString(n%2);
        n=n/2;
        solve(n, st);
        st.append(str1.toString());
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int n=sc.nextInt();

        StringBuilder st=new StringBuilder("");
        solve(n,st);
        System.out.println(st);
    }
    
}
