package day7;
import java.util.*;
public class length_even_odd
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
            int count =0;
            int org = num;
           while(num!=0)
           {

               int pop = num%10;
               count ++;
               num/=10;
           }
            if(count%2==0)
            {
                sum1+= org;
            }
            else
            {
                sum2+=org;
            }
        }
        System.out.println("even sum ="+sum1);
        System.out.println("odd sum=" +sum2);
    }

}
