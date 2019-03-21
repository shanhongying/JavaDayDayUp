import java.util.Scanner;

import static java.lang.System.out;
public class Test {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        out.print("请输入用户名：");
        String name=input.next();
        out.print("请输入密码：");
        String password=input.next();
        if(password.length()>6){
            out.println("注册成功！");
        }else{
            out.println("密码长度不能小于6位!");
        }
    }
}
