public class TestSuper02 {
    public static void main(String args[]){
        System.out.println("开始创建一个ChildClass对象....");
        new  ChildClass2();
    }
}

class FatherClass2{
    static {

    }
    public FatherClass2(){
        System.out.println("创建FatherClass2");
    }
}

class ChildClass2 extends FatherClass2{
    public ChildClass2(){
        super();//所有构造方法第一句都是这个
        System.out.println("创建ChildClass2");
    }

}