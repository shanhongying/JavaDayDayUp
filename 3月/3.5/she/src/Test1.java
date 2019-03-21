
   class A{
       int a;
   }
   class B extends A{
    public void b(){}
   }
   class C extends B{
    public void c(){
        super.b();
    }
   }
   public class Test1 {
    public static void main(String args[]){
        C c=new C();
        c.a=10;
    }
   }

