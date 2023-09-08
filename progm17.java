import java.util.Scanner;
class method{
    static String ch;
    public static void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string:");
        ch=sc.nextLine();
    }
    public static void display()
    {
        System.out.println(ch);
    }
    public static void main(String args[])
    {
        method m1= new method();
        method.input();
        method.display();
    }
}
