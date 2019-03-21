import java.util.Scanner;

public class rrr {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入消费金额：");
        int money = input.nextInt();
        System.out.println("是否参加优惠换购活动：");
        System.out.println("1：满50，加2得小可乐");
        System.out.println("2：满100，加3得大可乐");
        System.out.println("3：满100，加10得5公斤面粉");
        System.out.println("4：满200，加10得炒菜锅");
        System.out.println("5：满200，加20得爽肤水");
        System.out.println("0：不换购");
        System.out.println("请选择：");
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                if(money>=50)
                {
                    System.out.println("消费总金额：" + (money + 2));
                    System.out.println("成功换购小可乐");
                }
                else
                    System.out.println("不能换购");
                break;
            case 2:
                if(money>=100)
                {
                    System.out.println("消费总金额：" + (money + 3));
                    System.out.println("成功换购大可乐");
                }
                else
                    {
                    System.out.println("不能换购");
                }
                break;
            case 3:
                if(money>=100)
                {
                    System.out.println("消费总金额：" + (money + 10));
                    System.out.println("成功换购面粉");
                }
                else
                    System.out.println("不能换购");
                break;
            case 4:
                if(money>=200)
                {
                    System.out.println("消费总金额：" + (money + 10));
                    System.out.println("成功换购炒菜锅");
                }
                else
                    System.out.println("不能换购");
                break;
            case 5:
                if(money>=200)
                {
                    System.out.println("消费总金额：" + (money + 10));
                    System.out.println("成功换购爽肤水");
                }
                else
                    System.out.println("不能换购");
                break;
            case 0:
                System.out.println("不参加换购");
                break;

        }
    }
}