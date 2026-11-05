public class Demo25 {
    public static void main(String[] args) {
        Student1.university="xxxxxx";
        Student1 s1 = new Student1();
        s1.name="xrs";
        s1.age=18;
        //s1.university="xxxx";
        s1.show();

        Student1 s2 = new Student1();
        s2.name="xrs";
        s2.age=18;
       // s2.university="xxxx";
        s2.show();

        //static 修饰特点
        // 被类的所有对象共享
        // 判断是否使用静态关键字的条件

        /*
        非静态的成员方法
        能访问静态的成员变量
        能访问非静态的成员变量
        能访问静态的成员方法
        能访问非静态的成员方法:
        静态的成员方法
        能访问静态的成员变量
        能访问静态的成员方法
         */
    }
}
