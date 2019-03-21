import java.util.Scanner;

public class ticket {
    String name;
    int age;
    public void xitong(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入姓名：");

        for(;;){
            name=input.next();//录取了数字，并且在结果中显示
            if(name.equals("n")){
                System.out.println("退出程序");
                break;
            }
            else{

                System.out.println("请输入年龄：");
                age=input.nextInt();
                if(age>=18) {
                    System.out.println(name + "的年龄为，" + age + "门票价格为：20元");
                }else {
                    System.out.println(name + "的年龄为，" + age + "门票免费");
                }
            }

        }

    }
}
