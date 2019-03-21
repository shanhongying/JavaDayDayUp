import static java.lang.System.out;
public class Test3 {
    public static void main(String args[]){
        String str="abcdebfg123.com";
        int i=str.indexOf("x");
        out.println(i);
        if(str.indexOf("@")<str.indexOf(".")&&str.indexOf("@")>=0){
            out.println("yes");
        }else{
            out.println("no");
        }
    }
}
