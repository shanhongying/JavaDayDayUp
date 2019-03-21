import java.util.Scanner;

public class Game {
    public void start(){
        Person p =new Person();
        Computer c =new Computer();
        Scanner input =new Scanner(System.in);//录入准备
        System.out.println("-----欢迎进入游戏世界-----");
        System.out.println("********猜拳，开始*******");
        System.out.println("出拳规则：1.石头2.剪刀3.布");
        c.chooseRenwu();
        p.setName();
        System.out.println(p.name+" VS "+c.name+" 对战");
        System.out.println("是否开始（y/n）?");
        String answer=input.next();
        int ci=0;
        while (answer.equals("y")){
            ci++;
            int pquan=p.chu();
            int cquan=c.chu();
            if((pquan==1&&cquan==2)||(pquan==2&&cquan==3)||(pquan==3&&cquan==1)){
                System.out.println(p.name+"获胜");
                p.jifen++;
            }else if(pquan==cquan){
                System.out.println("平局");
            }else{
                System.out.println(c.name+"获胜");
                c.jifen++;
            }
            System.out.println("是否开始下一轮？");
            answer=input.next();
        }

            System.out.println(c.name + " VS " + p.name + "的次数" + ci);
        System.out.println("姓名\t得分");
        System.out.println(c.name+"\t "+c.jifen);
        System.out.println(p.name+"\t "+p.jifen);
    }

}
