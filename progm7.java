import java.util.Scanner;
class Natural
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the range upto you want the sum:");
      int a= sc.nextInt();
      int sum=0;
      for(int i=1; i<=a; i++)
        {
          sum=sum+i;
        }
      System.out.println("printing the sum of natural numbers upto the given range="+sum);
    }
  }
