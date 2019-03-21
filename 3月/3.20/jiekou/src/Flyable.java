public interface Flyable {
    int MAX_SPEED=11999;
    int MIN_HEIGHT=1;
    /*public abstract 写或不写都可以*/  void fly();
}

interface Attack{

}

class Plane implements Flyable{
    public void fly(){
        System.out.println("飞机依靠发动机在飞！");
    }
}

class Man implements Flyable{
    public void fly(){
        System.out.println("跳起来，飞！");
    }
}

class Stone implements Flyable,Attack{
    public void fly(){
        System.out.println("被人扔出去，飞！");
    }
    public void Attack(){
        System.out.println("用石头攻击");
    }
}