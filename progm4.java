import java.util.Scanner;
class check
  {
    public static void main(String[]args)
    {
    Scanner sc= new Scanner(System.in);
      System.out.println("enter any number:");
      int n= sc.nextInt();
      if(n%2==0)
      {
        System.out.println("Number is even");
      }
      else{
        System.out.println("Number is odd");
      }
      
    }
  }
