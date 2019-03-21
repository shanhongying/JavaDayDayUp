public class t2 {
    //年龄加2
    public void abc(t1 s){
    s.age+=2;
    }
    public static void main(String args[]){
        t1 stu=new t1();
        t1.name="张三";
        t1.age=20;

        Test t=new Test();
        t.abc(stu);
    }
}
