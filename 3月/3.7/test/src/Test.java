//门
abstract  class Door{
 public abstract void open();
 public abstract void close();
}
//接口：锁
interface Lock{
    int i=1;  //都是静态常量
    public void lock();
    public void unlock();//都是抽象方法
}
//接口：照相机
interface  Crame{
    //不是默认权限，而是public abstract
  void takePhotos();
}
//防盗门,多实现接口，功能越来越强大
class FDoor extends Door implements Lock,Crame{
  public void open(){
      System.out.println("开门");
  }
  public void close(){
      System.out.println("关门");
  }
  public void lock(){
      System.out.println("上锁");
  }
  public void unlock(){
      System.out.println("解锁");

  }
  public void takePhotos(){
      System.out.println("拍照存档");
  }
}

public class Test {
    public static void main(String args[]){
        FDoor fd=new FDoor();
        fd.close();
        fd.lock();
        fd.takePhotos();
        fd.unlock();
        fd.open();
    }
}
