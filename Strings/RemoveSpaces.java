import java.util.*;

public class RemoveSpaces {
    public static void main(String args[])
    {
        StringBuilder s=new StringBuilder("Hello world");
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
                s.deleteCharAt(i);
            }
        }

        System.out.println(s);
    }
}
