public class Person {
    private String name = "";//姓名
    private int age = 1;//年龄
    private String sex = "男";//性别

    public void setSex(String sex) throws Exception {
        if ("男".equals(sex) || "女".equals(sex)) {
            this.sex = sex;
        } else {
            throw new Exception("性别必须是男或者女！");
        }
    }

    public static void main(String args[]) throws Exception {
      Person p=new Person();
      p.setSex("");
    }
}