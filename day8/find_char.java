package day8;

public class find_char
{
    public static void main(String[]args)
    {
        String name = "hello world";
        char [] name1=name.toCharArray();
        char target = ' ';
        if(ls(name1,target))
        {
            System.out.println("Found");
        }
        else {
            System.out.println("Not found");
        }
    }
    public static boolean ls(char[]name1, char target)
    {
        for(char n: name1)
        {
            if(n==target)
            {
                return true;
            }
        }
        return false;
    }
}
