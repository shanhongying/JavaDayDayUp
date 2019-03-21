public class TestEncapsulation2 {
        private int id;
        private String name;
        private int age;
        private boolean man;


// age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=1&&age<=130){
        this.age = age;
        }
        else{
            System.out.println("请输入正常的年龄！");
        }
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }
}
