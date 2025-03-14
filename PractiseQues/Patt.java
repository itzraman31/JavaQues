import java.util.*;
// 2 8 18 32 50 50 32 18 8 2  // Numbers
//  6 10 14 18 0 18 14 10 6  //  Diff
public class Patt {
    public static void solve(int n,int num,int diff){
        if(n==0)return;

        diff+=4;
        System.out.print(num+" ");
        solve(n-1,num+diff, diff);
        System.out.print(num+" ");

    }
    public static void main(String[] args) {
        solve(5,2,2);
    }    
}
