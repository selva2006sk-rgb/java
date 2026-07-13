package day2;
import java.util.*;
public class Arthmatic
{
    public static void main(String[]args)
    {
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int a = s.nextInt();
        System.out.println("Enter num2: ");
        int b = s.nextInt();
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        System.out.println("Sum of two number is "+c);
        System.out.println("Difffernce of two number is : " +d);
        System.out.println("Multiplication of two number is : " +e);
        System.out.println("divison of two number is : "+f);
        System.out.println("increment"+a++ + " " + b++);
        System.out.println("decrfement"+a-- +" "+b--);

    }


}


