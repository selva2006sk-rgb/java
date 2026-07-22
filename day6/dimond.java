package day6;

public class dimond
{
    public static void main(String[]args)
    {
        int n=5;
        for(int i =1;i<n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k =1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        int nn=5;
        for(int ii =n;ii>0;ii--)
        {
            for(int jj=0;jj<=nn-ii;jj++)
            {
                System.out.print(" ");
            }
            for(int kk =1;kk<=2*ii-1;kk++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
