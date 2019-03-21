import java.util.Scanner;

class person{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0||age>150){
            this.age=18;
            System.out.println("年龄录入错误，恢复默认年龄18.");
        }else{
        this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(name+   age);
    }
}
public class Test {
    public static void main(String args[]){
        System.out.println("请录入会员信息：");
        Scanner input=new Scanner(System.in);
        System.out.print("请输入姓名：");
        person p=new person();
        p.setName(input.next());
        System.out.print("请输入年龄：");
        p.setAge(input.nextInt());
        p.print();
    }
}
