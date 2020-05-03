import java.util.Scanner;
public class Main{
    public static void main(String args[]) 
    {
       Scanner in = new Scanner(System.in);
       char c = in.next().charAt(0);
       int n = in.nextInt();
       if(c >= 'a' && c <='z')
       {
          c = (char)(c - n);
          if(c < 'a')
             c = (char)(c + 26);
          if(c > 'z')
             c = (char)(c - 26);
       }
       if(c >= 'A' && c <='Z')
       {
          c = (char)(c - n);
          if(c < 'A')
             c = (char)(c + 26);
          if(c > 'Z')
             c = (char)(c - 26);
       }
       System.out.println(c);
    }
}