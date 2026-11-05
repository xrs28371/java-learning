public class Demo24 {
    public static void main(String[] args) {
        //final修饰基本变量
        final int age = 20;
        System.out.println(age);

        //final 修饰引用类型变量
        Student s1 = new Student();
        //加了final地址没有办法改变的
        //地址里面

        //s1.age=100;
        //System.out.println(s1.age);
    }
}
