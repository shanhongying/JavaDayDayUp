public class TsstString {
    public static void main(String[] args) {
        System.out.println("ABCd".equalsIgnoreCase("abcd"));
        System.out.println("AbCdeb".lastIndexOf('b'));
        System.out.println("AbCDef".startsWith("A"));
        System.out.println("AbCDef".toLowerCase());
        System.out.println("Absusah".toUpperCase());

        System.out.println("----------------------");

        String gh=new String("a");
        for (int i = 0; i <10 ; i++) {
            gh+=i;
        }
        System.out.println(gh);
    }

}
