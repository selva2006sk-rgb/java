package day3;
import java.util.*;
public class loop
{
    public static void  main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        int sum =1;
        for (int i=1; i<=a;i++)
            {
                 sum=sum*i;
            }
        System.out.print(sum);


    }
}
