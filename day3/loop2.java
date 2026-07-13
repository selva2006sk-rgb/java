package day3;
import java.util.*;
public class loop2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner (System.in);
        int num = s.nextInt();
        int rev =0;
        while(num!=0)
        {
            int pop = num%10;
            rev = rev*10+pop;
            num/=10;
        }
        System.out.println(rev);

    }
}
