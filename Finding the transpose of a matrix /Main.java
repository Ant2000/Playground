import java.util.Scanner;
public class Main
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int row = in.nextInt(), column = in.nextInt();
      int mat1[][] = new int[row][column];
      for(int i = 0; i < row; i ++)
      {
         for(int j = 0; j < column; j++)
            mat1[i][j] = in.nextInt();
      }
      
      for(int i = 0; i < column; i ++)
      {
         for(int j = 0; j < row; j++)
         {
            System.out.print(mat1[j][i] + " ");
         }
         System.out.print("\n");
      }
   }
}