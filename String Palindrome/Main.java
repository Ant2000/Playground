import java.util.Scanner;
public class Main
{
   public static void main(String args[]) 
   {
      Scanner in = new Scanner(System.in);
      String s1 = in.nextLine();
      int n = s1.length();
      StringBuilder s2 = new StringBuilder();
      for(int i = n - 1; i >= 0; i--)
      {
         s2.append(s1.charAt(i));
      }
      if(s1.equals(s2.toString()))
         System.out.println("Yes");
      else
         System.out.println("No");
   } 
}