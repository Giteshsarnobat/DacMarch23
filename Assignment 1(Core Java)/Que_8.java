class a_byte
{
    public static void main(String args[])
    {
       byte a = 123;
       String str = Byte.toString(a);
       System.out.println(str);
    }
}



class b_byte
{
    public static void main(String args[])
    {
       byte a = 123;
       Byte b = Byte.valueOf(a);
       System.out.println(b);
    }
}



class c_byteInt
{
    public static void main(String args[])
    {
       String str = new String("10");
       byte b = Byte.valueOf(str);
       System.out.println(b);
    }
}


