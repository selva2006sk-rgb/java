package day3;
import java.util.*;
public class nestedif
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(a!=0)
        {
            if(a%2==0)
            {
                if(a>b)
                {
                    System.out.print("true");
                }
            }
        }
        else
        {
            System.out.print("false");
        }
    }
}
