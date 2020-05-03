import java.util.Scanner;
public class Main
{
   public static int GCD (int a, int b, int c)
   {
      int smallest = 0;
      if (a < b && a < c)
         smallest = a;
      else if (b < a && b < c)
         smallest = b;
      else
         smallest = c;
      int GCDs = 1;
      for(int i = smallest; i > 0; i--)
      {
         if(a % i == 0 && b % i == 0 && c % i == 0)
         {
            GCDs = i;
            break;
         }
      }
      return GCDs;
   }
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt(), n2 = in.nextInt(), n3 = in.nextInt();
      System.out.println(GCD(n1, n2, n3));
   }
}