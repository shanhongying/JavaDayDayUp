public class TestObject {
    public static void main(String args[]){
        TestObject to=new TestObject();
        System.out.println(to.toString());

        Person2 p=new Person2("Pilferer",24);
        System.out.println(p);

    }

    public String toString(){
        return "测试重写方法";
    }

}

class Person2{
  String name;
  int age;

  public String toString(){
      return name+",年龄："+age;
  }
    public Person2(String name,int age){
        this.name=name;
        this.age=age;
    }

}
