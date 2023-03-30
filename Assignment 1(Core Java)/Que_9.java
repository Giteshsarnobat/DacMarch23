class Que_9
{
    public static void main(String arg[])
    {   byte val = 115;
        Byte b = new Byte(val);
        byte by = b.byteValue();
        System.out.println(by);
        
        short sh = b.shortValue();
        System.out.println(sh);

        int i = b.intValue();
        System.out.println(i);

        long lo = b.longValue();
        System.out.println(lo);
       
        float f = b.floatValue();
        System.out.println(lo);

        double d = b.doubleValue();
        System.out.println(d);

    }
}