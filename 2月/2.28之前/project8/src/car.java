import java.util.Scanner;

public class car {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();
        if(money>=20)
        {
            System.out.println("宝马");
        }
        else if(money>15)
        {
            System.out.println("花");
        }
        else if(money>=5)
        {
            System.out.println("树木");
        }
    }
}
