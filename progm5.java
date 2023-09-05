import java.util.Scanner;
class alpha
  {
    public static void main(String[]args)
    {
    Scanner sc= new Scanner(System.in);
      System.out.println("enter any alphabet:");
       char ch=sc.next().charAt(0);
      if(ch=='a'|| ch=='i'|| ch=='e'|| ch=='o' || ch=='u')
      {
        System.out.println("entered alphabet is vowel");
      }
      else{
        System.out.println("entered alphabet is constant");
      }
      
    }
  }
