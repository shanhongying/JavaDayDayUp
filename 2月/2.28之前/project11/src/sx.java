import java.util.Arrays;
import java.util.Scanner;

public class sx {
    public static void main(String aqgs[]){
      Scanner input = new Scanner(System.in);
      System.out.println("请输入五位同学的成绩：");
      int fens[]=new int[5];
      for(int i=0;i<fens.length;i++){
       fens[i]=input.nextInt();
      }
      System.out.println("排序之前");
      for(int i=0;i<fens.length;i++){
          System.out.println(fens[i]+"   ");
      }
      System.out.println("排序之后：");
      //数组排序；
        Arrays.sort(fens);
        for(int i=0;i<fens.length;i++){
            System.out.println(fens[i]);
        }
    }
}
