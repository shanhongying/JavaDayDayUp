public class Test01 {
    public static void main(String args[]){
       int [] arr01=new int[10];
       String[] arr02=new String[5];
       User[] arr03=new User[4];

       for(int i=0;i<arr01.length;i++){
           arr01[i]=10*i;
           System.out.print(arr01[i]+" ");
       }

        arr03[0]=new User(1,"s");
        arr03[1]=new User(2,"h");
        arr03[2]=new User(3,"y");
        arr03[3]=new User(4,"g");

        for(int i=0;i<arr03.length;i++){
            System.out.print(arr03[i].getId()+" ");
        }
    }
}

