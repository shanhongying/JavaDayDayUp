package com.bank;

import java.util.Scanner;
import static java.lang.System.out;

public class Account {
    int money=0;
    Scanner input=new Scanner(System.in);
    public void start() {
        for(;;){
            out.println("1.存款 2.取款 3.退出");
            out.print("请选择要办理的业务");
            switch (input.nextInt()) {
                case 1:
                    out.println("请输入存款金额：");
                    int jin = input.nextInt();
                    cun(jin);
                    break;
                case 2:
                    out.println("请输入取款金额：");
                    jin = input.nextInt();
                    qu(jin);
                    break;
                case 3:
                    out.println("谢谢使用，再见！");
                    return;
            }
            out.println("***当前余额：" + money + "***");
        }
    }
    //存款
    public void cun(int jin){
     money+=jin;
     out.println("存款成功！\n");
    }
    //取款
    public void qu(int jin){
        if(money>=jin) {
            money = money - jin;
            out.println("取款成功！\n");
        }else{
            out.println("余额不足！");
        }
    }
}
