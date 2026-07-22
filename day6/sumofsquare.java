package day6;

public class sumofsquare
{
    public static void main(String[]args)
    {
        for(int i =1; i<=5;i++)
        {
            int num =i;
            for(int j=1;j<=5;j++)
            {
                System.out.print(" "+ num);
                num = num+5-j;
            }
            System.out.println();
        }
    }
}
