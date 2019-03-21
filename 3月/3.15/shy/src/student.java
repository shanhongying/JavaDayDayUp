 class student {
    int age;
    String name;
    Comptuer comp;
    void study(){
        System.out.println(comp.brand);
    }
    public static void main(String args[]){
     student stu=new student();
     stu.age=24;
     stu.name="shy";
     Comptuer c1=new Comptuer();
     c1.brand="hp";
     stu.comp=c1;
     stu.study();
     System.out.println(c1);
     System.out.println(stu);
    }

}
class Comptuer{
    String brand;
}