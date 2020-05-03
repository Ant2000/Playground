import java.util.Scanner;
class Main
{
   public static int power (int a, int b)
   {
      int base = a;
      int expo = b;
      for(int i = 1; i < b; i++)
         base = base * a;
      return base;
   }
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt(), n2 = in.nextInt();
      System.out.println(power(n1, n2));
   }
}