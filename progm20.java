class Box
{
    private double length,breadth,height;
    public void setDimension(double l, double b, double h)
    {
        length =l;
        breadth=b;
        height=h;
    
    }
    public void getDimension()
    {
        System.out.println("length is="+length);
        System.out.println("breadth is="+breadth);
        System.out.println("height is="+height);
        
    }
    public static void main(String args[])
    {
        Box b1=new Box();
        b1.setDimension(2.2,1.5,2.0);
        b1.getDimension();
        
        
        
    }
}
