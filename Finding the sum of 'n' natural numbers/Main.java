import java.util.Scanner;
public class Main 
{
    int count = 0;
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(add(n));
        
        
    }
    public static int add(int n)
    {
        if(n == 0)
        {
           return 0;
        }
        n = n + add(n - 1);
        return n;
    }
}
