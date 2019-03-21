abstract class Pet{
    public abstract void eat();
}

class Dog extends Pet{
    public void eat(){
     System.out.println("吃骨头");
    }
}
class Cat extends Pet{
    public void eat(){
    System.out.println("吃鱼");
    }
}
class Tiger extends Pet{
    public void eat(){
        System.out.println("吃肉");
    }
}
class Master{
    public void feed(Pet p) {
        p.eat();
    }
}
public class Test1 {
  public static void main(String args[]){
      Master m=new Master();
      m.feed(new Cat());
      m.feed(new Dog());
      m.feed(new Tiger());
  }
}
