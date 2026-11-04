public class StudentDemo1 {
    public static void main(String[] args) {
        //学生测试类

        //创建对象
        StudentDemo s=new StudentDemo();

        //使用对象
        //System.out.println(s.name+s.age);

        s.name="xrs";
        //s.age=10;//可能存在数据隐患
        s.setAge(199);


        s.study();
        s.doHomework();
        s.show();
    }
}
