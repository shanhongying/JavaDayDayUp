import java.util.Scanner;

abstract class Pet{
    int health=60;
    int love=0;
    public abstract void eat();
}

class Dog extends Pet{
    public void eat(){
        System.out.println("狗吃骨头！");
    }
    public void playF(){
       System.out.println("玩飞盘！");
       System.out.println(health-=10+   love);
    }
}

class Cat extends Pet{
    public void eat(){
        System.out.println("猫吃鱼！");
    }
}

class Master{
    public Pet getPet(int id){
        switch(id){
            case 1:  return new Dog();
            case 2:  return new Cat();
        }
        return null;
    }
}
public class Test {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要领养的动物：1.狗狗 2.猫咪");
        int id=input.nextInt();
        Master m=new Master();
        Pet p=m.getPet(id);//返回的虽然是父类类型，但实际是子类对象
        p.eat();
    }

}
