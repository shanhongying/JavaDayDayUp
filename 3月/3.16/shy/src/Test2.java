public class Test2 {
    int age;
    String name;
    int rank;
    static String company;
    public static void printCompany(){
        System.out.println(company);
    }

    static {
        System.out.println("执行类的初始化");
        company="阿里巴巴";
        System.out.println(company);

    }
    public static void main(String args[]){
      Test2 user=null;

    }
}
