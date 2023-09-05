import java.util.Scanner;
class posit
  {
      public void check()
      {
    int i;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter any number:");
     i =sc.nextInt();
    
      if(i<0)
      {
        System.out.println("entered number is negative=" +i);
      }
      else{
        System.out.println("entered number is positive=" +i);
      }
    }
    public static void main(String[]args)
    {
      posit p1= new posit();
      p1.check();
    }
  }
      
      
