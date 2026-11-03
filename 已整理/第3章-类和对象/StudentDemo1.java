public class StudentDemo1 {
    public static void main(String[] args) {
        //学生测试类

        //创建对象
        StudentDemo s=new StudentDemo();

        //使用对象
        System.out.println(s.name+s.age);

        s.name="xrs";
        s.age=10;
        System.out.println(s.name+s.age);

        s.study();
        s.doHomework();
        s.show();
    }
}
