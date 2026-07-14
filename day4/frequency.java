package day4;
import java.util.*;
public class frequency
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int frq = s.nextInt();
        int count =0;
        while(num!=0)
        {
            int pop = num%10;
            if(pop==frq)
            {
                count ++;
            }
            num/=10;
        }
        System.out.print(count);
    }
}
