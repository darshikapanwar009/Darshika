//to check the character is present is or not
class a
{
    public static void main(String args[])
    {
        String a="Umbrella";
        boolean b=false;
        for(int i=0; i<a.length(); i++)
        {
            if(a.charAt(i)=='a')
            {
                b=true;
                break;
            }
        }
        System.out.println(b);
    }
}
