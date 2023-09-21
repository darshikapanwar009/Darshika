//menu driven programimport java.util.Scanner;
class UserChoice{
    static String ch;
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string:");
        ch=sc.nextLine();
        System.out.println("0.convert to uppercase");
        System.out.println("1.convert to lowercase");
        System.out.println("enter your choice");
        int i=sc.nextInt();
        switch(i)
        {
            case 0:String s=ch.toUpperCase();
            System.out.println(s);
            break;
            case 1: String s1=ch.toLowerCase();
            System.out.println(s1);
            break;
            default:System.out.println("invalid output");
            break;
        }
    }
}
