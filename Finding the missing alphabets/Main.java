import java.util.Scanner;
public class Main
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int arr[] = new int[26], offset;
      String str = in.nextLine();
      str = str.toLowerCase();
      char c;
      for(int i = 0; i < str.length(); i++)
      {
         c = str.charAt(i);
         if(c >= 'a' && c <= 'z')
         {
            offset = c - 'a';
            arr[offset]++;
         }
      }
      for(int i = 0; i < 26; i++)
      {
         if(arr[i] == 0)
         {
            c = (char)(i + 'a');
            System.out.print(c + " ");
         }
      }
   }
}