package day2;
import java.util.*;
public class loan
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int sa = s.nextInt();
        System.out.println("Enter loan ammount: ");
        int l =s.nextInt();
        String loan = (sa>=750 && l>100000 )? "Eligible":"Not eligible";
        System.out.println(loan);
    }
}
