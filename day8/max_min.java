package day8;

import java.util.Scanner;

public class max_min
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Read array elements
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        int min = arr[0][0];

        // Find maximum and minimum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        System.out.println("Maximum Value = " + max);
        System.out.println("Minimum Value = " + min);

        sc.close(); // Optional but recommended
    }

}