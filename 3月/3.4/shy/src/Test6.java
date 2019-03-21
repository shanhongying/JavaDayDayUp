public class Test6 {
    public static void main(String args[]){
       String str="fxnajbiougiajbivuovkvavblbvuvaboiul";
       int i=0;
       while(str.indexOf("a")>=0){
           str=str.substring(str.indexOf("a")+1);
           i++;
           System.out.println(str);
       }
       System.out.println(i);
    }
}
