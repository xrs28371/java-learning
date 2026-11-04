public class StudentDemo1 {
    public static void main(String[] args) {
        //创建对象
        Student s=new Student();
        s.show();

        //使用set赋值
        s.setName("xrsxrs");
        s.setAge(23);

        //调用show方法
        s.show();

        //对象
        Student s1=new Student("xrs",30);
        s1.show();


    }
}
