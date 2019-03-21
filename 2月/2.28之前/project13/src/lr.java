import java.util.Scanner;

public class lr {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        sf a =new sf();
        System.out.println("请输入java成绩：");
        a.java=input.nextInt();
        System.out.println("请输入c成绩：");
        a.c=input.nextInt();
        System.out.println("请输入db成绩：");
        a.db=input.nextInt();

        System.out.println("总成绩："+a.zong());
        System.out.println("平均成绩："+a.jun());

    }
}
