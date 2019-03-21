import java.util.Scanner;

public class yh {
    public static void main(String aqgs[]){
        Scanner input=new Scanner(System.in);
        for(int i=2;i>=0;i--){
        System.out.print("请输入账号：");
        String name=input.next();
        System.out.print("请输入密码：");
        int password=input.nextInt();

            if (name.equals("sa") && password == 123) {
                System.out.println("欢迎进入系统!");
                break;
            }
            else {
                System.out.println("密码错误，你还有"+i+"次机会");
                if(i==0){
                    System.out.println("三次全错，账户锁定！");
            }

            }
        }
    }
}
