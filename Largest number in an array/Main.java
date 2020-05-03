import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int i = 0; i < size; i++)
         arr[i] = in.nextInt();
      int temp = 0;
      for(int i = 0; i < size; i++)
      {
         if(arr[i] > temp)
            temp = arr[i];
      }
      System.out.println(temp);
   }
}