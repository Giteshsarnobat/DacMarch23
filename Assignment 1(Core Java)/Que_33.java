import java.util.Scanner;
class Que_33
{
public static void main(String args[])
 {
        int num1 = Integer.parseInt(args[0]);
        float num2 = Float.parseFloat(args[1]); 
        double num3 = Double.parseDouble(args[2]);
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice:");
        System.out.println("1:Addition 2:Subtraction 3:Multiplication 4:Division");
        int n = sc.nextInt();

        switch(n)
        {
            case 1: System.out.println("Addition: " + (num1 + num2 + num3));
                    break;

            case 2: System.out.println("Subtraction: " + (num1 - num2 - num3));
                    break;

            case 3: System.out.println("Multiplication: " + (num1 * num2 * num3));
                    break;

            case 4: System.out.println("Division: " + (num1 / num2 / num3));
                    break;

            default:System.out.println("  ");
                    break;
        }

    }
}
  