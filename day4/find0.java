package day4;
import java.util.*;
public class find0
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int rev =0;
        while(num!=0)
        {
            int pop = num%10;
            num /=10;
            if(pop == 0)
            {
                System.out.print("it have zero");
                break;
            }
        }



    }
}
