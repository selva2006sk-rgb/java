package day7;
import java.util.*;
public class sum_of_even_odd
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];

        int  sum1 =0;
        int sum2=0;
        for(int i=0;i<n;i++)
        {
            int a= s.nextInt();
            arr[i]=a;
        }
        for(int num:arr)
        {
            if(num%2==0)
            {
                sum1 += num;
            }
            else
            {
                sum2+=num;
            }
        }
        System.out.println("even sum ="+sum1);
        System.out.println("odd sum=" +sum2);
    }

}
