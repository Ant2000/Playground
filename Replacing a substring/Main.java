import java.util.Scanner;
public class Main
{
   public static void main(String[] args) 
   { 
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine(), str2 = in.nextLine(), str3 = in.nextLine();
      str1 = str1.replace(str2, str3);
      System.out.println(str1);
   }
}