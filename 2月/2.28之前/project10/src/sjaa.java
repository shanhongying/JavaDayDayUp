
import java.util.Scanner;

public class sjaa
{
    public static void main(String args [])
    {
        System.out.println("条目\t华氏温度\t摄氏温度");
        int tm =1;
        int she=0;
        int hua;
        do{
            hua=(int)(she*9/5.0+32);
            System.out.println(tm+"\t"+hua+"\t"+she);
            tm++;
            she+=20;
        }while(tm<=10);

    }
}
