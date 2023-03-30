class Que_20a{
    public static void main(String[] args){
    long n = 100l;
    String str = Long.toString(n);
    System.out.println(str);
    }
}

class Que_20b{
    public static void main(String[] args)
    {
        long n = 100l;

        Long s1 = Long.valueOf(n);

        System.out.println(s1);
    }
}


class Que_20c{
    public static void main(String[] args)
    {
        String str = new String("12");

        long n = Long.valueOf(str);

        System.out.println(n);
    }
}


class Que_20d{
    public static void main(String[] args)
    {
        long n = 120l;

        System.out.println("Binary: "+Long.toBinaryString(n));

        System.out.println("Octal: "+Long.toOctalString(n));

        System.out.println("Hexa Decimal: "+Long.toHexString(n));

    }
}