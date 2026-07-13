package day2;

import java.util.*;
public class vote
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = s.nextInt();
        if(age>=18)
        {
            System.out.println("Eligibel");
        }
        else
        {
            System.out.println("Not eligible");
        }
    }
}
