import java.util.Arrays;

public class Student {
    public double avg(int fens[]){
        int sum=0;
        for(int i=0;i<fens.length;i++){
            sum=sum+fens[i];
        }
        return sum/ fens.length*1.0;
    }
   public int max(int fens[]){
        Arrays.sort(fens);
        return fens[fens.length-1];
   }
}
