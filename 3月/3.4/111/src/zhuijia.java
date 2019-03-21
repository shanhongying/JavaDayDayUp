import static java.lang.System.out;
public class zhuijia {
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("单洪颖");
        int num=666;
        StringBuffer sb1=sb.append("善良");
        out.println(sb1);
        StringBuffer sb2=sb1.append("可爱");
        out.println(sb2);
        StringBuffer sb3=sb2.append(num);
        out.println(sb3);
    }
}
