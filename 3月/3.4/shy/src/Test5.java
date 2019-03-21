public class Test5 {
    public static void main(String args[]){
        String str="123-123323";
        String s[]=str.split("-");
        System.out.println(s[0]);
        System.out.println(s[1]);
        if(s[0].length()==3&&s[1].length()==6){
           System.out.println("ok");
        }else{
            System.out.println("no");
        }
    }
}
