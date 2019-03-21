public class Test3 {
    int age;
    String name;
    public Test3(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void change01(Test3 user){
    user=new Test3(22,"单洪颖");
    System.out.println(user.name);
    }
    public void change02(Test3 user){
        user.name="小黄";
    }
    public static void main(String args[]){
        Test3 user=new Test3(23,"沈建");
        user.change01(user);
        System.out.println(user.name+user.age);
        user.change02(user);
        System.out.println(user.name+user.age);
    }
}
