import java.util.Arrays;

public class zf {
    public static void main(String args[]){
      char arr[] ={'a','c','u','b','e','p','f','z'};
        System.out.println("原字符序列：");
      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+"   ");
      }
        System.out.println("");
        System.out.println("升序排序后：");
      Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
        }
        System.out.println("");
        System.out.println("逆序输出为：");
        for(int i=(arr.length-1);i>=0;i--){
            System.out.print(arr[i]+"   ");
        }
    }
}
