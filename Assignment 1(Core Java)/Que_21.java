class Que_21
{
    public static void main(String args[])
    {
      long sh = 32l;
      Long s = new Long(sh);
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