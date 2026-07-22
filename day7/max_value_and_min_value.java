package day7;
import java.util.*;
public class max_value_and_min_value
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr= new int [n];
        int max =arr[0];
        int min =arr[0];
        for(int i=0;i<n;i++)
        {
            int a = s.nextInt();
            arr[i] = a;
        }
        for(int num:arr)
        {
            if(num>max)
            {
                max=num;
            }
            else if (num<min)
            {
                min=num;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
