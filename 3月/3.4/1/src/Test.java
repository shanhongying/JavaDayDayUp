public class Test {
    public static void main(String args[]){
       Wen w1=new Wen();
       Wen w2=new Wen();
       Wen w3=new Wen();
       Wen w4=new Wen();
       w1.title="我爱java";
       w1.see=111;
       w2.title="我爱篮球";
       w2.see=99;
       w3.title="我爱编程公会";
       w3.see=666;
       w4.title="我爱面向对象";
       w4.see=88;
       Wen ws[]=new Wen[4];
       ws[0]=w1;
       ws[1]=w2;
       ws[2]=w3;
       ws[3]=w4;
       Wen test=new Wen();
       test.sort(ws);
       for (int k = 0; k< 4; k++) {
          ws[k].print();
       }
       }
    }

