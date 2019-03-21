import java.util.*;

public class Test1 {
    public static void main(String args[]){
        Dog d1=new Dog("大傻","哈士奇");
        Dog d2=new Dog("二傻","阿拉斯加");
        Dog d3=new Dog("三傻","萨摩耶");

        //动态数组
        List dogs=new ArrayList();
        System.out.println(dogs.size());
        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);
        System.out.println(dogs.size());
        for(int i=0;i<dogs.size();i++){
            Dog d=(Dog)dogs.get(i);
            System.out.println(d);
        }
    }
}
