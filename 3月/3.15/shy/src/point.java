class jisuan{
    double x,y;
    jisuan(double a,double b){
        x=a;
        y=b;
    }
    public double getDistance(jisuan p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
}

public class point {
    public static void main(String args[]){
        jisuan p=new jisuan(3.0,4.0);
        jisuan origin=new jisuan(0,0);
        System.out.println(p.getDistance(origin));
    }
}
