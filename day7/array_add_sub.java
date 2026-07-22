package day7;
import java.util.*;
public class array_add_sub
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = s.nextInt();
        System.out.print("Enter column");
        int col = s.nextInt();
        int [][] a= new int [row][col];
        int [][] b = new int [row][col];
        int [][] sum = new int [row][col];
        System.out.println("Enter number for row:");
        for(int i=0 ; i<row;i++)
        {
            for(int j =0;j<col;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter numbers for columns");
        for(int i =0;i<col;i++)
        {
            for(int j=0;j<col;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        System.out.println("Sum of matrix is");
        for(int i =0; i<row;i++)
        {
            for(int j =0;j<col;j++)
            {
                sum [i][j] = a[i][j]+b[i][j];
                System.out.print(" "+sum[i][j]);
            }
            System.out.println();
        }

    }
}

