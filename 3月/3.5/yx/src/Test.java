public class Test {
    public void a1(){
        System.out.println("1");
    }
    public static void a2(){
        System.out.println("2");
    }

    public static void main(String args[]){
        Test b=new Test();
        b.a1();
        a2();
    }
    static {
        System.out.println("3");
    }
}
