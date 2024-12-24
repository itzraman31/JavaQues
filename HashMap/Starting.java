
// package HashMap;
import java.util.*;

public class Starting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String: ");
        String s = sc.nextLine();

        // Map<Character,Integer> mp=new HashMap<>();
        Map<Character,Integer> mp=new TreeMap<>();

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)!=' ')
            {  
                int d=mp.getOrDefault(s.charAt(i), 0);
                mp.put(s.charAt(i),d+1);
            }
        }

        String str="";

        for (var st : mp.keySet()) {

            str=str+""+st+":"+mp.get(st)+", ";
        }
        StringBuilder res=new StringBuilder(str);
        res.setCharAt(str.length()-2, ' ');
        System.out.println(res.toString().trim());

    }
}
