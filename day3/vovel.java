package day3;
import java.util.*;
public class vovel
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        char b=(char)a;
        System.out.println(b);
        switch(b)
        {
            case 'a':
            {
                System.out.print("vovel");
                break;
            }
            case 'A':
            {
                System.out.print("vovel");
                break;
            }
            case 'e':
            {
                System.out.print("vovel");
                break;
            }
            case 'E':
            {
                System.out.print("vovel");
                break;
            }
            case 'i':
            {
                System.out.print("vovel");
                break;
            }
            case 'I':
            {
                System.out.print("vovel");
                break;
            }
            case 'o':
            {
                System.out.print("vovel");
                break;
            }
            case 'O':
            {
                System.out.print("vovel");
                break;
            }
            case 'u':
            {
                System.out.print("vovel");
                break;
            }
            case 'U':
            {
                System.out.print("vovel");
                break;
            }
            default:
            {
                System.out.println("consonent");
            }
        }
    }
}
