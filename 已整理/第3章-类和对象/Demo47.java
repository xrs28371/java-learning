public class Demo47 {
    public static void main(String[] args) {
        //多个对象指向相同的内存
        StudentDemo a1=new StudentDemo();
        a1.name="xrs";
        a1.age=18;
        System.out.println("Name:"+a1.name);
        System.out.println("Age:"+a1.age);


        //把第一个对象的地址赋值给第二个对象
        StudentDemo a2=a1;
        a2.name="xrs";
        a2.age=18;
        System.out.println("Name:"+a2.name);
        System.out.println("Age:"+a2.age);
        System.out.println("Age:"+a1.age);

        //成员变量和局部变量
        //成员变量：类中方法外的变量
        //局部变量：方法中的变量

        //区别就在 类中位置不同
        // 成员 ：类中方法外
        //局部：方法内或者方法声明上

        //内存中位置不同
        //成员：堆内存
        //局部：栈内存

        //生命周期不同
        //成员：随着对象的存在而存在
        //局部：随着方法的调用而存在

        //初始值不同
        //成员：又默认的初始值；    比如说int 0 String null
        //局部：没有默认的初始化值

    }
}
