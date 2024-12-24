import java.util.*;
// Other imports go here
// Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
    String s;
    String u;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Username: ");
    u=sc.nextLine();
    System.out.println("Enter password");
    s=sc.nextLine();
    
    if(s.length()<6)
    {
      System.out.print("Too short!");
      return;
    }
    int c=0;
    for(int i=0; i<s.length(); i++)
    {
      if(s.charAt(i)>='0' && s.charAt(i)<='9')
      {
        c++;
      }
    }
    if(c==0)
    {
      System.out.print("No digit!");
      return;
    }
    System.out.print("Correct");

  }
}