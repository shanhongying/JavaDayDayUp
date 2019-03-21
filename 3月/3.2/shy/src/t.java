import java.util.Scanner;

public class t {
    public static void main(String args[]){
        student stu=new student();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入五位参赛者的成绩：");
        int score[]=new int[5];
        for(int i=0;i<score.length;i++){
            score[i]=input.nextInt();
        }
        System.out.println(stu.zong(score));
        System.out.println(stu.avg(score));
    }
}
