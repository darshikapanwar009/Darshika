class Light
{
    boolean On;
    public void switchOn()
    {
        On=true;
        System.out.println(On);
    }
    public void switchOff()
    {
        On=false;
        System.out.println(On);
    }
    public static void main(String[]args)
    {
        Light led=new Light();
        Light halogen=new Light();
        led.switchOn();
        halogen.switchOff();
    }
    
}
