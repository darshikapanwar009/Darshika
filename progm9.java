import java.util.Scanner;
class multi
  {
    public static void main(String args[])
    {
    Scanner inp = new Scanner(System.in);
      System.out.println("enter any number:");
      int m= inp.nextInt();
      for(int i=1; i<=10; i++)
        {
          System.out.println("table of a given no.="+m+"*"+i+"="+m*i);
            }
    }
  }
