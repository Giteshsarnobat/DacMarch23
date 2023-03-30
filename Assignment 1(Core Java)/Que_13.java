class Que_13
{
   public static void main(String arg[])
   {
      short sh = 200;
      String str = Short.toString(sh);
      System.out.println(str);


      short s = Short.valueOf(sh);
      System.out.println(s);
    

   }
}


class Que_13a
{
    public static void main(String args[])
    {
        String st = new String("123");
        short s = Short.valueOf(st);
        System.out.println(s);
        
    }
}