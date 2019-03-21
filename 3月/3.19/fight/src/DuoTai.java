public class DuoTai {

    public static void testAnimalVoice(Animal c){
        c.voice();
        if(c instanceof Cat){
            ((Cat) c).catchMouse();
        }else{
            ((Dog) c).eat();
        }
    }

    public static void main(String args[]){
        Animal a=new Cat();
        Animal b=new Dog();
//        Cat a2=(Cat)a;
        testAnimalVoice(a);
        testAnimalVoice(b);
    }
}

class Animal{
    String str;
    public void voice(){
        System.out.println("普通动物叫声！");
    }
}

class Cat extends Animal{
    public void voice(){
        System.out.println("喵喵喵");
    }
    public void catchMouse(){
        System.out.println("捉老鼠");
    }
}

class Dog extends Animal{
    public void voice(){
        System.out.println("汪汪汪");
    }
    public void eat(){
        System.out.println("吃骨头");
    }
}