public class studentManage {
    String names [] = new String[5];
    //添加姓名
    public void addName(String name){
        for(int i=0;i<names.length;i++){
            if(names[i]==null){
                names[i]=name;
                break;
            }
        }
    }
    //打印姓名
    public void show(){
        System.out.println("学生列表");
        for(int i=0;i<names.length;i++){
           System.out.print(names[i]);
        }

    }
    //修改姓名
    public void update(String oldName,String newName){
        for(int i=0;i<names.length;i++){
            if(names[i].equals(oldName)){
                names[i]=newName;
                System.out.println("找到并修改成功");
                break;
            }

        }

    }
}
