import java.util.Scanner;

public class test {
    public static void main(String args []){
       studentManage stu=new studentManage();
       Scanner input=new Scanner(System.in);
       for(int i=1;i<=5;i++){
           System.out.print("请输入学生姓名：");
           String name=input.next();
           stu.addName(name);
       }
        stu.show();
       System.out.println("请输入要修改的姓名");
       String oldName=input.next();
       System.out.println("请输入新的姓名" );
       String newName=input.next();
       stu.update(oldName,newName);
       stu.show();
    }

}
