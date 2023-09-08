import java.util.Scanner;
class GCD
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first no. :");
        int d=sc.nextInt();
        System.out.println("enter second no. :");
        int s=sc.nextInt();
        int gcd=1;
        for(int i=1; i<=d&& i<=s; i++)
        {
            if(d%i==0 && s%i==0)
            {
                gcd=i;
            }
        }
            System.out.println("gcd of two number is="+gcd);
        
        
        
        
    }
}
