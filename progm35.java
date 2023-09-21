//to check the no. of vowels and consonants 
import java.util.Scanner;
class Count{
    
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string:");
        String ch=sc.next();
    String ch1 =ch.toUpperCase();
        int v=0,count=0;
        for(int i=0; i<ch1.length(); i++)
        {
            char c=ch1.charAt(i);
        if(c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')
        {
            v++;
        
        }
        
    else{
    
        count++;
        
    }
}
    System.out.println("no. of vowels is :"+v);
            System.out.println("no of consonants is :"+count);
            
        }
    }
