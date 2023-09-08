//unboxing of wrapper type objects
//wap  
class unbox
{
    public static void main(String args[])
    {
  Character i= new Character('s');
      char ch=i.charValue();
      System.out.println(i+" "+ch);
      Boolean b= new Boolean(true);
      boolean bh=b.booleanValue();
      System.out.println(b+" "+bh);
      Integer j= new Integer(4);
      int is=j.intValue();
      System.out.println(j+" "+is);
      Float ft= new Float(2.22);
      float f1=ft.floatValue();
      System.out.println(ft+" "+f1);
      Short s= new Short();
      short s1=s.shortValue();
      System.out.println(s+" "+s1);
      Byte w= new Byte(0);
      byte w1= w.byteValue();
      System.out.println(w+" "+w1);
      Long l1=new Long(874110963);
      long lg=l1.longValue();
      System.out.println(l1+" "+lg);
      Double db=new Double(5.0);
      double d1=db.doubleValue();
      System.out.println(db+" "+d1);
      
      
      
      
      
      
      
      
            
      
    }
}
