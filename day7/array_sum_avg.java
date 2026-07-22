package day7;
import java.util.*;
public class array_sum_avg
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = s.nextInt();
        int [] arr = new int[n];
        int sum =0;
        int length = arr.length;
        for(int i =0; i<n;i++)
        {
            int num1 = s.nextInt();
            arr [i] = num1;
        }
        for(int num: arr)
        {
            sum+=num;
        }
        float avg = (float)sum/length;
        System.out.println("sum of given array is: "+sum);
        System.out.println("average of given array is: "+avg);

    }
}
