package day6;

public class numbertriangle
{
    public static void main(String[]args)
    {
        int num =1;
        for(int i=0;i<5;i++)
        {
            for(int j =0;j<=i;j++)
            {
                System.out.printf(" "+num);
                num ++;
            }
            System.out.println();
        }
    }
}
