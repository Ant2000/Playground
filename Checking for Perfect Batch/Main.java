import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
     int size = in.nextInt();
     int batches = size/3;
     int num[] = new int[size];
     int sums[] = new int[batches];
     for(int i = 0; i < size; i++)
        num[i] = in.nextInt();
     int counter = 0;
     for(int i = 0; i < batches; i++)
     {
        for(int j = 0; j < 3; j++)
        {
           sums[i] = sums[i] + num[counter];
           counter ++;
        }
     }
     int temp = sums [0], flag = 1;
     for(int i = 0; i < batches; i++)
     {
        if(temp != sums[i])
        {
           flag = 0;
           break;
        }
     }
     if(flag == 0)
        System.out.println("Not a Perfect Batch");
     else
        System.out.println("Perfect Batch");
  }
}