abstract class A{
    public abstract void run();//抽象类不能new
}
class TA extends A{
    public void run(){
        System.out.println("测试A");
    }
}

/**通常在继承关系中，父类为了规范代码，而且父类本身new出来没有意思，我们就使用抽象来修饰父类，
 * 父类中的方法，也可以设置为抽象办法
 */
public class Test {
    public static void main(String args[]) {

    }
}
