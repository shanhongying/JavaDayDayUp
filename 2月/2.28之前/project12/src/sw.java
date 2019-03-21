import java.util.Arrays;
import java.util.Scanner;

public class sw {
    public static void main(String args[]){
        System.out.println("请输入4家店的价格：");
        Scanner input=new Scanner(System.in);
        int price []=new int[4];
        for(int i=0;i<price.length;i++){

            System.out.print("第"+(i+1)+"家店的价格:");
            price[i]=input.nextInt();

        }
        Arrays.sort(price);
        System.out.println("最低价格是:"+price[0]);
    }
}
