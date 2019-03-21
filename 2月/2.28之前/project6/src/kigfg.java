import java.util.Scanner;

public class kigfg {
    public static  void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入4位会员卡号:");
        int vip = input.nextInt( );
        System.out.println("1234");

        int ge = vip%10;
        int shi = vip/10%10;
        int bai = vip/100%10;
        int qian = vip/1000;
        System.out.println("各个之和:"+ge+shi+bai+qian);
        System.out.println("");


    }
}
