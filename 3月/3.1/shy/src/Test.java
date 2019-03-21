import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        Student stu=new Student();
        Scanner input =new Scanner(System.in);
        System.out.print("请输入五位同学的成绩：");
        int cj []= new int[5];
        for(int i=0;i<cj.length;i++){
            cj[i]=input.nextInt();
        }
        System.out.println("平均分为"+stu.avg(cj));
        System.out.println("平均分为"+stu.max(cj));
    }
}
