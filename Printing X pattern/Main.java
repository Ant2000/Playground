import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       for (int i = 0; i < n/2 + 1 ; i++)
       {
            for(int j = 0; j < i ; j++)
                System.out.print(' ');
            for(int k = 0; k < n - (2 * i); k++)
            {
                if(k == 0 || k == n - (2 * i) - 1)
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.print('\n');
       }
       for (int i = n/2 - 1; i >= 0 ; i--)
       {
            for(int j = 0; j < i ; j++)
                System.out.print(' ');
            for(int k = 0; k < n - (2 * i); k++)
            {
                if(k == 0 || k == n - (2 * i) - 1)
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.print('\n');
       }
	}
}