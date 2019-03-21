public class PaintFrame {
    public static void drawFrame01(IMyFrame f){
        System.out.println("启动线程");
        System.out.println("增加循环");
        System.out.println("查看消息栈");

        //画窗口
        f.paint();

        System.out.println("启动缓存，增加效率");
    }

    public static void drawFrame02(MyFrame f){
        System.out.println("02");

        //画窗口
        f.paint();

        System.out.println("启动缓存，增加效率");
    }
    public static void main(String[] args) {
        drawFrame01(new GameFrame01());
        drawFrame02(new GameFrame02());
    }
}
class GameFrame01 implements IMyFrame{
    public void paint(){
        System.out.println("GameFrame01.paint()");
        System.out.println("画窗口");
    }
}

class GameFrame02 extends MyFrame{

    @Override
    public void paint() {
        System.out.println("GameFrame02.paint()");
    }
}