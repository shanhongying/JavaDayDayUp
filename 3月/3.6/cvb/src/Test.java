class Person{
    public String say(){
        return "握手";
    }
}

class USA extends Person{
    public String say(){
        return "拥抱";
    }
}
public class Test {
    public static void main(String args[]){
        USA p=new USA();
        System.out.println(p.say());
    }
}
