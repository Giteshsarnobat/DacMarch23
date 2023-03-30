class Que_28a{
    public static void main(String[] args){
    double n = 100d;
    String str = Double.toString(n);
    System.out.println(str);
    }
}



class Que_28b{
    public static void main(String[] args)
    {
        double n = 100.00;

        double s1 = Double.valueOf(n);

        System.out.println(s1);
    }
}




class Que_28c{
    public static void main(String[] args)
    {
        String str = new String("12.00");

        double n = Double.valueOf(str);

        System.out.println(n);
    }
}




class Que_28d
{
    public static void main(String[] args)
    {
        double n = 100.00;

       System.out.println("Hexa Decimal: "+ Double.toHexString(n));


    }
}
