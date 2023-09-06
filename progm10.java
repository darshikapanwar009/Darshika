class display
  {
    public void upper()
    {
      char ch;
      for(ch='A'; ch<='Z'; ch++)
        {
System.out.println(ch);
        }
    }
    public static void main(String args[])
    {
      display d1 = new display();
      d1.upper();
    }
  }
