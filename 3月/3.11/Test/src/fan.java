
public class fan {
    public static void main(String args[]){
        Point<Integer> p=new Point<Integer>();
        p.setX(10);
        p.setY(11);

        int x=(Integer)p.getX();
        int y=(Integer)p.getY();
        System.out.println(x+";"+y);
    }
}
