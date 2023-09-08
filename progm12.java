import java.util.Scanner;
class rev
{

public void reverse()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number:");
   int v=sc.nextInt();
    int sum=0;
int r;
    while(v!=0)
    {
    r=v%10;
    sum=sum*10+r;
    v=v/10;
}
System.out.println("reverse of a no is="+sum);
    
}
public static void main(String[]args)
{
    rev rs=new rev();
    rs.reverse();
}
}
