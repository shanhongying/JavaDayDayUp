import static java.lang.System.out;
public class Test2 {
    public static void main(String args[]){
        String a=new String("abc");
        String b=new String("abc");
        out.println(a.equals(b));//判断ab是否长得一样
        out.println(a==b);//判断ab的地址（a和b是不是同一个对象）
    }
}
