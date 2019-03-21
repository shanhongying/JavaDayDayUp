import java.util.Scanner;

public class ifyuju {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入四位会员号：");
        int vip = input.nextInt();
        int bai = vip/100%10;
        double d =Math.random();
        System.out.println(bai);
        System.out.println(d);

        if(bai == (int)d)
        {
            System.out.println(vip+"号客户是幸运客户，获得精美Mp3一个");
        }
        else
        {
            System.out.println(vip+"号客户，谢谢你的支持");
        }
    }
}
