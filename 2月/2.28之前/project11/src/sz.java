import java.util.Scanner;

public class sz {
    public static void main(String args[]){
        int arr []={8,4,2,1,23,34,12};
        Scanner input=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<(arr.length);i++){
            sum+=arr[i];
            System.out.print(arr[i]+"   ");
        }
        System.out.println("总和"+sum);
        System.out.print("请输入一个数字：");
        int shu =input.nextInt();
        int x=0;
        for(int i=0;i<arr.length;i++){
            if(shu==arr[i]){
                x=1;
                break;
            }
        }
        if(x==1){
            System.out.println("包含这个数字！");
        }
            else{
                System.out.println("不包含这个数字！");
            }

    }
}
