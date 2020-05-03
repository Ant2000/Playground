import java.util.Scanner;
class Main
{
   public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for (int i = 0; i < size; i++)
         arr[i] = in.nextInt();
      int n1 = in.nextInt(), n2 = in.nextInt(), index1 = -1, index2 = -1;
      for(int i = 0; i < size; i++)
      {
         if(n1 == arr[i])
            index1 = i;
         if(n2 == arr[i])
            index2 = i;
      }
      System.out.println(index1);
      System.out.println(index2);
    }
}