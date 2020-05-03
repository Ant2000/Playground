import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int num[] = new int[size];
      int temp = 0, pos = 0;
      for(int i = 0; i < size; i++)
         num[i] = in.nextInt();
      for(int i = 0; i < size; i++)
      {
         if(temp < num [i])
         {
            temp = num [i];
            pos = i;
         }
      }
      System.out.println(pos);
   }
}