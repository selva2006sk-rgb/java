package day2;
import java.util.*;
public class condution
{
    public static void main (String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your per day salary");
        int a = s.nextInt();
        System.out.println("Monthly salary ="+a*30);
        System.out.println("Yearly salary= "+a*365);
    }
}
