import java.util.Scanner;

public class jx {
    public static void main(String args[])
    {
       Scanner input=new Scanner(System.in);
       System.out.println("输入学生姓名：");
       String name =input.next();
       int zong=0;
       for(int i=1;i<=5;i++)
       {

        System.out.print("请输入5门课中第"+i+"门课的成绩：");
           int score= input.nextInt();
           zong=zong+score;
       }

       System.out.print(name+"的平均分是："+zong/i);
    }
}
