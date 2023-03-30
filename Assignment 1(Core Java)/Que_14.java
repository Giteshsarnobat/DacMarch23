class Que_14
{
    public static void main(String args[])
    {
      short sh = 32;
      Short s = new Short(sh);
      byte b = s.byteValue();
      System.out.println(b);

      short c = s.shortValue();
      System.out.println(c);
        
      int i = s.intValue();
      System.out.println(i);
        
      long l = s.longValue();
      System.out.println(l);

      float f = s.floatValue();
      System.out.println(f);
        
      double d = s.doubleValue();
      System.out.println(d);
        
            
    }
}