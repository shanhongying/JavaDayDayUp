public abstract class Animal {
    int age;
    public abstract void run();
    public void breath(){
        System.out.println("呼吸！");
    }
}

class Cat extends Animal{

    @Override
    public void run() {
        System.out.println("猫步小跑");
    }
}
class Dog extends Animal{
    public void run(){
        System.out.println("傻狍子跑");
    }

}