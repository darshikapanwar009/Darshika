//printing the mail of a person
import java.util.Scanner;
class mail
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String s=sc.next();
        String y="2022";
        System.out.println("enter the enrollment no.");
        String enroll=sc.next();
        String s1=enroll.substring(9,12);
        System.out.println(s+y+s1+"@acropolis.in");
        
        
    }
}
