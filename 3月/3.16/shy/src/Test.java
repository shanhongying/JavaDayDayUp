public class Test {
    int age;
    String name;
    int rank;
    static String company="阿里巴巴";
    public Test(int age,String name){
        this.age=age;
        this.name=name;
    }
    public static void printCompany(){
        System.out.println(company);

    }
   public void login(){
   printCompany();
       System.out.println(company);
   }
    public static void main(String args[]){
        Test user=new Test(23,"shy");
        user.printCompany();
        user.login();
    }
}
