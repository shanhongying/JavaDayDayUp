public class jiechen {
    public static void main(String args[]){
        long t1=System.currentTimeMillis();
        System.out.printf("%d阶乘的结果是：%s\n",12,jie(12));
        long t2=System.currentTimeMillis();
        System.out.printf("消耗的时间：%s\n",t2-t1);
        cheng(12);
    }
    static long jie(int n){
        if(n==1){
            return 1;
        }else{
            return n*jie(n-1);
        }
    }

    static long cheng(int n){
        long t3 = System.currentTimeMillis();
        long result = 1;
        while (n > 1) {
            result*= n * (n - 1);
            n =n- 2;
        }
        long t4 = System.currentTimeMillis();
        System.out.printf("循环消耗的时间：%s\n", t4 - t3);
        System.out.println("循环结果："+result);
        return result;
    }
}
