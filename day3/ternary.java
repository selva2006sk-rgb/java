package day3;
import java.util.*;
public class ternary
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String e = (a%2==0)?"even":"odd";
        System.out.print(e);
    }
}
