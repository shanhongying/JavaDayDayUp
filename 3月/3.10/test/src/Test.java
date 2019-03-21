import java.util.Enumeration;
import java.util.Vector;

public class Test {
    {
        Dog d1 = new Dog("大傻", "哈士奇");
        Dog d2 = new Dog("二傻", "阿拉斯加");
        Dog d3 = new Dog("三傻", "萨摩耶");

        Vector v =new Vector();
        v.addElement(d1);
        v.addElement(d2);
        v.addElement(d3);

        Enumeration ens = v.elements();

        while (ens.hasMoreElements()){
            System.out.println(ens.nextElement());
        }

    }
}
