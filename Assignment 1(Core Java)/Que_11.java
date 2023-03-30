class Que_11{
    public static void main(String[] args){

        char ch = args[0].charAt(0);

        System.out.println("You have Entered: "+ch);

        if(Character.isLetter(ch))
        {
            System.out.println("It is a Character!!");

            //int codePoint = Character.codePointAt(String.valueOf(ch), 0);
            int codePoint = Character.codePointAt(args[0], 0);

            System.out.println("Code Point of "+ch+" is "+codePoint);
            
            if(Character.isLowerCase(ch))
            {
                char ch1 = Character.toUpperCase(ch);
                System.out.println("Character: "+ch1);
                int codePoint1 = Character.codePointAt(String.valueOf(ch1), 0);
                System.out.println("Code Point of "+ch+" is "+codePoint1);
            }
            else
            {
                char ch2 = Character.toLowerCase(ch);
                System.out.println("Character: "+ch2);
                int codePoint2 = Character.codePointAt(String.valueOf(ch2), 0);
                System.out.println("Code Point of "+ch2+" is "+codePoint2);
            }
        }
        
    }

}