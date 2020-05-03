import java.util.Scanner;
class Main
{
   public static int checkPrime(int n)
   {
      int flag = 0;
      if(n == 0 || n == 1)
         return 1;
      else if(n == 2)
         return 0;
      for(int i = 2; i < n/2 + 1 ; i++)
      {
         if(n % i == 0)
         {
            flag = 1;
            break;
         }
      }
      return flag;
   }
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       for(int i = 1; i < n; i++)
       {
          if(checkPrime(i) == 0)
             System.out.println(i);
       }
	}
}