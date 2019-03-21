package cn.shy.oop.testinterface;

public class MyClass implements MyInterface {
    public void test01(){
        MyInterface.MAX_GREAD;
        System.out.println("test01");
    }
    public int test02(int a,int b){
        System.out.println("test02");
        return  a+b;
    }
}
