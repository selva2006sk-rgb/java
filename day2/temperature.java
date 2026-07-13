package day2;
import java.util.*;
public class temperature
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter c:");
        int c = s.nextInt();
        int a=c*9/5;
        int f = a+32;


        System.out.println(f);

    }
}
