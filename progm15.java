class priv
{
    private int i,j;
    public void setter(int a,int b)
    {
       int i=a;
       int j=b;
    }
    public void getter()
    {
     System.out.println(i+" "+j);
    }
    public static void main(String[]args)
    {
        priv p1=new priv();
        p1.setter(50,75);
        p1.getter();
    }
    
}
    
