public class TestOverRide {
    public static void main(String args[]){
        Horse h=new Horse();
        h.run();
    }
}
class Vehicle {
    public void run() {
        System.out.println("跑。。。");
    }

    public void stop() {
        System.out.println("停止！");
    }
}
class Horse extends Vehicle{
    public void run(){
        System.out.println("驾！");
    }
}