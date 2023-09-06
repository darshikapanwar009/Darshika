import java.util.Scanner;
class Factorial
  {
    public static void main(String args[])
    {
      int fact=1;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter any number:");
      int n=sc.nextInt();
      for(int i= 1; i<=n; i++)
        {
          fact=fact*i;
        }
      System.out.println("factorial of a no. is="+fact);
    }
  }

      
