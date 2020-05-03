import java.util.Scanner;
public class Main
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine(), str2 = in.nextLine();
      int n1 = str1.length(), n2 = str2.length();
      int count = 0;
      for(int i = 0; i < n1 - n2 + 1; i++)
      {
         StringBuilder s = new StringBuilder();
         for(int j = i; j < n2 + i; j++)
            s.append(str1.charAt(j));
         if(str2.equals(s.toString()))
            count++;
      }
      System.out.println(count);
   }
}
