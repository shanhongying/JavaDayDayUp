import java.util.Scanner;

public class Person {
    String name;
    int jifen;
    Scanner input = new Scanner(System.in);
    public void setName(){
        System.out.print("请输入您的姓名：");
        name=input.next();
    }
    public int chu(){
        System.out.print("请出拳（1.石头，2.剪刀，3.布）：");
        int choose=input.nextInt();
        switch(choose){
            case 1:
                System.out.println("您出拳为石头");
                break;
            case 2:
                System.out.println("您出拳为剪刀");
                break;
            case 3:
                System.out.println("您出拳为布");
                break;
        }

        return  choose;
    }

}
