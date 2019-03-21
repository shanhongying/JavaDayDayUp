import static java.lang.System.out;
public class Test4 {
    public static void main(String args[]){
        String word="Hello,  ";
        word=word.trim();
        String s=word.concat("格瑞泰伦特！");
        int a=s.indexOf(",");
        int b=s.indexOf("!");
        out.println(s.substring(a+1,b));
    }
}
