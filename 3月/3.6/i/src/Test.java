
abstract class Pet{
    int health;
    public abstract void eat();

}

class Dog extends Pet{
   public void eat(){
     System.out.println("吃骨头");
     health+=5;
   }
}
class Master{
    public void feed (Pet p){
        p.eat();
    }
}

public class Test {
    public static void main(String args[]){
        Master m=new Master();
        m.feed(new Dog());
    }
}
