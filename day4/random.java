package day4;
import java.util.*;
public class random
{
    public static  void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        Random r = new Random();
        int key = r.nextInt(10);
        int guess;
        do{
            System.out.print("enter the value of your guess");
            guess = s.nextInt();
            if(guess>key)
            {
                System.out.print("guess is to high");
            }
            else if(guess<=key)
            {
                System.out.print("guess is too low");
            }
        }while(key!=guess);
        {
            System.out.print("yes guess it");
        }
    }
}
