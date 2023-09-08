//autoboxing of all primitive datatypes
class copy1
{
    public static void main(String [] args)
    {
        boolean m=true;
        Boolean i=Boolean.valueOf(m);
        System.out.println(m+" "+i);
        double d= 5.0D;
        Double d1=Double.valueOf(d);
        System.out.println(d+" "+d1);
        int a=20;
      Integer i1= Integer.valueOf(a);
      System.out.println(a+" "+i1);
      byte bt=10;
      Byte b1=Byte.valueOf(bt);
      System.out.println(bt+" "+b1);
      short s=9000;
      Short s1=Short.valueOf(s);
      System.out.println(s+" "+s1);
      long m1=25147L;
        Long w=Long.valueOf(m1);
        Long j1=m1;
        System.out.println(m1+" "+w+ " "+j1);
        char ch='m';
        Character ch1=Character.valueOf(ch);
        System.out.println(ch+" "+ch1);
    }
}

        
      
      
      
    
        
    

