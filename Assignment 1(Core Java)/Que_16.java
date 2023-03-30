class Que_16a
{
    public static void main(String args[])
    {
        int a = 123;
        String st = Integer.toString(a);
        System.out.println(st);


        int i = Integer.valueOf(a);
        System.out.println(i);
    }
}


class Que_16b
{
    public static void main(String args[])
    {
       String st = new String("123");
       int n = Integer.valueOf(st);
       System.out.println(n);

    }
}



class Que_16c
{
    public static void main(String args[])
    {
       int n = 1000;
       String a = Integer.toBinaryString(n);
       System.out.println(a);

       String b = Integer.toOctalString(n);
       System.out.println(b);

       String c = Integer.toHexString(n);
       System.out.println(c);



    }
}

