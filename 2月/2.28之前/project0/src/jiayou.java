import java.util.Scanner;

public class jiayou {
    public static void main(String args[]) {
        System.out.println("检查张三的学习任务是否合格");
        Scanner input = new Scanner(System.in);
        String xicg = input.next();
        while (xicg.equals("no"))
        {
            System.out.println("上午看书，下午编程");
            System.out.println("老师，我合格了吗？");
            xicg=input.next();
        }
      System.out.println("休息");
    }
    }

