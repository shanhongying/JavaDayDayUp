public class TestString {
    public static void main(String[] args) {
        String str=new String("abcdefg");

        System.out.println(str.charAt(3));
        System.out.println(str.indexOf("c"));
        System.out.println(str.substring(0));
        String str2=str.replace('e','*');
        System.out.println(str2);
        String str3=new String("abcdefg,sdffsaf,sadfqfr");
        String[] arr=str3.split(",");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(str.toString());
        String str4="  aaa sss  ";
        System.out.println(str4.trim().length());


    }
}
