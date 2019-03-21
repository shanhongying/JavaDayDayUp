
public class Test {
    //具有最高的执行优先级
    //类加载的时候就被执行了
    static{
        System.out.println("1");
    }
    public void a1(){
        System.out.println("2");
    }
    public static void a2(){
        System.out.println("3");
    }
    public static void main(String args[]){
        a2();
     Test t1=new Test();
     t1.a1();

    }
}
