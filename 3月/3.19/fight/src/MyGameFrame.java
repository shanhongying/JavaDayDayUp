import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends JFrame {

    public void paint(Graphics g){//自动被调用，g相当于画笔
        Color c=g.getColor();

        g.setColor(Color.BLUE);
        g.drawLine(100,100,300,300);
        g.drawRect(100,100,300,300);
        g.drawOval(100,100,300,300);
        g.setColor(Color.RED);
        g.fillRect(100,100,40,40);
        g.setFont(new Font("黑体",Font.BOLD,50));
        g.drawString("我是谁？",250,250);

        g.setColor(c);


    }
    /**
     * 初始化窗口
     */
    public void launchFrame(){
       this.setTitle("单洪颖作品");
       this.setVisible(true);
       this.setSize(500,500);
       this.setLocation(100,100);

       this.addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent e){
               System.exit(0);
           }
       });
    }

    public static void main(String args[]){
        MyGameFrame f=new MyGameFrame();
        f.launchFrame();
    }
}
