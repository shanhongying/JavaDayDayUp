public class Dog {
    private String name;
    private String type;

    public Dog(String s1,String s2){
      name=s1;
      type=s2;
    }
    public String toString(){
        return "昵称："+name+" 品种："+type;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
