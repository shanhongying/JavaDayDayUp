class Dog{
    private String name;
    public Dog(){
      System.out.println("无参的构造");
    }

    public Dog(String name){
        this();//调用构造：必须是第一句代码
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
public class Test{
   public static void main(String args[]){
       Dog d=new Dog("花花");
     System.out.println("");
   }
}
