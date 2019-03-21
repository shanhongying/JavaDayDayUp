import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        studentManage stu = new studentManage();
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.print("请输入学生姓名：");
            String t=input.next();
            stu.addName(t);
        }

     stu.show();
        System.out.println();
        System.out.print("请输入要修改的学生姓名:");
        String oldName=input.next();
        System.out.print("请输入新的姓名：");
        String newName=input.next();
        stu.update(oldName,newName);
        stu.show();

    }
}
