import java.util.Scanner;
public class Main
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int row = in.nextInt(), column = in.nextInt();
      int mat1[][] = new int[row][column], mat2[][] = new int[row][column];
      for(int i = 0; i < row; i ++)
      {
         for(int j = 0; j < column; j++)
            mat1[i][j] = in.nextInt();
      }
      for(int i = 0; i < row; i ++)
      {
         for(int j = 0; j < column; j++)
            mat2[i][j] = in.nextInt();
      }
      for(int i = 0; i < row; i ++)
      {
         for(int j = 0; j < column; j++)
         {
            mat1[i][j] = mat1[i][j] - mat2[i][j];
            System.out.print(mat1[i][j] + " ");
         }
         System.out.print("\n");
      }
   }
}