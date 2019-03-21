import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Test {
    public static void main(String args[]){
        Map m=new HashMap();
        m.put("CN","中华人民共和国");
        m.put("RU","俄罗斯");
        m.put("US","美利坚合众国");
        m.put("JP","日本");


        System.out.println(m.get("CN"));
        System.out.println(m.size());
        System.out.println("包含吗？"+m.containsKey("RU"));

        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m);

        System.out.println("-------------");
        //使用迭代器
        Iterator it=m.keySet().iterator();
        while(it.hasNext()){
            String key=it.next().toString();
            System.out.println(key+"\t"+m.get(key));
        }

        System.out.println("-------------");
        //增强的foreach
        for(Object k:m.keySet()){
            System.out.println(k+"\t"+m.get(k));
        }
        m.clear();
        System.out.println(m.size());
//        Map m1=new Hashtable();
//        m1.put(null,null);
    }
}
