import java.util.Scanner;
class Main
{
   public static int gratest3 (int a, int b, int c)
   {
      if (a > b && a > c)
         return a;
      else if (b > a && b > c)
         return b;
      else
         return c;
   }
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt(), n2 = in.nextInt(), n3 = in.nextInt();
      System.out.println(gratest3(n1,n2,n3));
   }
}