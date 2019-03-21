package cn.shy.string.bulider;

public class Test02 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abcdefghijklmnopqrstovwxyz");
        System.out.println(sb.delete(1,4).delete(0,3));//方法链
    }
}
