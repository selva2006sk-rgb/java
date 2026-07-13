package day2;

import java.util.*;
public class logical
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a =s.nextInt();
        System.out.print("Enter num2: ");
        int b = s.nextInt();
        System.out.println(a>b && a<b);
        System.out.println(a<b || a>b);
        System.out.println(!(a<b));
    }




}
