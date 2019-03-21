package cn.shy.oop.testinterface;

public interface MyInterface {
    //接口中只有常量和抽象方法!
    /**
     * public static final 接口中定义常量时，写或不写都是这样
     */
    String MAX_GREAD="BOSS";
    int MAX_SPEED=120;

    public void test01();
    public int test02(int a,int b);

}
