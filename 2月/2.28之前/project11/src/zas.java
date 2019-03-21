import java.util.Scanner;

public class zas {
    public static void main(String args[]){
       System.out.println("请输入4家店的价格：");
       Scanner input=new Scanner(System.in);
       int price []=new int[5];
       for(int i=0;i<price.length;i++){
           price[i]=input.nextInt();
           System.out.println("第"+(i+1)+"家店的价格:"+price[i]);
       }
    }
}
