package day10;

public class replace_
{
    public static void main(String[]args)
    {
        StringBuilder name = new StringBuilder("hello");
        name.append(" world");
        name.replace(0,9,"hello guys");
        System.out.print(name);
    }
}
