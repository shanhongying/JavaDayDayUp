package cn.shy.neibulei;

public class Outer {
    public static void main(String[] args) {
        Face f=new Face();
        Face.Nose n=f.new Nose();
        n.breath();
        Face.Ear e=new Face.Ear();
    }

}
class Face{
    int type;
    static String shape="鹅蛋脸";
    class Nose{


        void breath(){

            System.out.println(shape);
            System.out.println("呼吸！");
        }
    }

    static class Ear{
        void  Listen(){
            System.out.println(shape);
        }
    }
}