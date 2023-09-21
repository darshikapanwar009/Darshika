//concantenation of string
import java.util.Scanner;
class str{
    static String ch;
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a first string:");
        ch=sc.nextLine();
        System.out.println("enter the second string");
        String ch1=sc.next();
        String s3= ch+" "+ch1;
        System.out.println(s3);
        
        
    }
}
