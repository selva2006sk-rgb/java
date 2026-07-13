package day3;
import java.util.*;
public class cal
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner (System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        s.nextLine();
        String a = s.nextLine();
        switch(a)
        {
            case "+":
            {
                System.out.print(num1+num2);
                break;
            }
            case "_":
            {
                System.out.print(num1-num2);
                break;
            }
            case "*":
            {
                System.out.print(num1*num2);
                break;
            }
            case "/":
            {
                System.out.print(num1/num2);
                break;
            }
            case "%":
            {
                System.out.print(num1%num2);
                break;
            }
            default:
            {
                System.out.print("not match");
                break;
            }


        }
    }

}
