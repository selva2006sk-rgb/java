package day7;
import java.util.Scanner;
public class array
{
    public static void main (String[]args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        char [] array = new char[n];
        for(int i =0;i<n;i++)
        {
            char a = s.next().charAt(0);
            array[i]=a;
        }

        for(char num:array)
        {
            System.out.println(num);
        }
    }
}
