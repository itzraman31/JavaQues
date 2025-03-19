// package Array;
import java.util.*;

public class Maxlen {
   public static int solve(String s){
    Set<Character> st=new HashSet<>();

    int maxSize=0;
    for(int i=0; i<s.length(); i++){
        if(!st.contains(s.charAt(i))){

            st.add(s.charAt(i));
        }
        else{
            int len=st.size();
            maxSize=Math.max(maxSize, len);
            st.clear();
            st.add(s.charAt(i));
        }
    }
    return maxSize;
   }

   public static void main(String[] args) {
    System.out.println(solve("bbbbbb"));
   }
}
