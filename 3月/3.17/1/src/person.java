public class person {
    int height;
    String name;
    int weight;
    public void rest(){
        System.out.println("休息一下！");
    }

}
class student extends person{
    public static void main(String args[]){
    System.out.println( shy instanceof  student);

    String major;
    public student(String name,int height){
        this.name=name;
        this.height=height;
    }
    student shy=new student("shy",168);
    public student(String major,int height,int weight){
        this.major=major;
        this.weight=weight;
        this.height=height;
    }
    public student(){

    }
    student sj=new student();

}
}
