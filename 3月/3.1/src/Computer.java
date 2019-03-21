import java.util.Scanner;

public class Computer {
    String name;
    int jifen;
    Scanner input = new Scanner(System.in);
    public void chooseRenwu(){
        System.out.println("请输入对方的角色:(1.奥特曼2.猪八戒3.沙和尚)");
        int choose = input.nextInt();
        switch (choose){
            case 1:
                name="奥特曼";
               break;
            case 2:
                name="猪八戒";
               break;
            case 3:
                name="沙和尚";

               break;
        }
    }
    public int chu(){
        //0~2之间的随机数
        int choose= (int)(Math.random()*3);
        switch (choose){
            case 0:
                System.out.println(name+"出拳为：石头");
                break;
            case 1:
                System.out.println(name+"出拳为：剪刀");
                break;
            case 2:
                System.out.println(name+"出拳为：布");
                break;
        }
        return choose+1;
    }


}
