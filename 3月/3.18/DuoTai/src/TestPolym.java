public class TestPolym {
    public static void main(String args[]){
        Animal a=new Animal();
        animalCry(a);
//        Dog d=new Dog();
        Animal d=new Dog();//自动向上转型
//        animalCry(d);
        Animal c=new Cat();
        Dog d3=(Dog)c;
        c.shout();
        Dog d2=(Dog) d;//强制向下转型
        d2.seeDoor();
        d2.shout();

}
    static void animalCry(Animal a){
        a.shout();
    }

}
final class Animal{
    public  void shout(){
        System.out.println("叫了一声！");
    }
}
class Dog extends Animal{
    public void shout(){
        System.out.println("汪汪汪！");
    }
    public void seeDoor(){
        System.out.println("看门");
    }
}
class Cat extends Animal{
    public void shout(){
        System.out.println("喵喵喵！");
    }
}