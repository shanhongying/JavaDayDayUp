package cn.shy.string.bulider;

/**
 * String(不可变字符序列）
 * 测试可变字符序列。StringBuilder(线程不安全，效率高)
 * StringBuffer(线程安全，效率低)
 */

public class Test01 {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder();//字符数组初始长度为16
        StringBuilder ab=new StringBuilder(32);//字符数组初始长度为32
        StringBuilder xb=new StringBuilder("abcd");//字符数组初始长度为32
        xb.append("efg");
        xb.append(true).append(1).append("321");//通过return this实行方法制
        System.out.println(xb);

        System.out.println("----------------------");

        StringBuilder gh=new StringBuilder("a");
        for (int g = 0; g <10 ; g++) {
            gh.append(g);
        }
        System.out.println(gh);
    }
}
