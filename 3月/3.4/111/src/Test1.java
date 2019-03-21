import java.util.Scanner;

public class Test1 {
    public static void main(String args[]){
     Scanner input=new Scanner(System.in);
     System.out.print("请输入数字：");
     String sb=input.next();
     StringBuffer str=new StringBuffer(sb);
     for(int i=str.length()-3;i>0;i=i-3){
         str.insert(i,",");
     }
     System.out.println(str);
    }
}
