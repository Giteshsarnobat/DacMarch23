class Que_24a{
    public static void main(String[] args){
    float n = 100f;
    String str = Float.toString(n);
    System.out.println(str);
    }
}

class Que_24b{
    public static void main(String[] args)
    {
        float n = 100f;

        float s1 = Float.valueOf(n);

        System.out.println(s1);
    }
}


class Que_24c{
    public static void main(String[] args)
    {
        String str = new String("12");

        float n = Float.valueOf(str);

        System.out.println(n);
    }
}


class Que_24d
{
    public static void main(String[] args)
    {
        float n = 120f;
        System.out.println("Hexa Decimal: "+Float.toHexString(n));

    }
}