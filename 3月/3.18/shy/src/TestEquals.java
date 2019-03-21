import java.util.Objects;

public class TestEquals {
    public static void main(String args[]){
        Object o;
        String str;

        User u1=new User(100,"shy","124");
        User u2=new User(1000,"she","123");

        System.out.println(u1==u2);
        System.out.println(u1.equals(u2));

        User u3=new User();
        u3.name="shy";
        User u4=new User();
        u4.name="shy";

        System.out.println(u3==u4);
        System.out.println(u3.equals(u4));

    }
}

class User {
    int id;
    String name;
    String pwd;

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }


//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return id == user.id;
//    }
  public User(){}


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }


}