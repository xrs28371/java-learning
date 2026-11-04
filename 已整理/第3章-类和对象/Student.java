public class Student {
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name=name;
        //this修饰成员变量
        //同名不带this修饰就是指的形参
        //this 就是解决局部变量隐藏成员变量

    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void show()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
    //set 改变变量
    //get 获取和输出变量

    //封装
    //面向对象的三大特征之一 （ 封装 继承 多态）
    //封装原则
    //将某些信息隐藏再类的内部，不允许外部程序直接访问 private 对于get set
    //提高安全性
    //提高复用性

    //构造方法概述
    //是一种特殊的方法
    // 类似  Student s =new Student();
    // public Student() {} 初始化工作

    //public Student()
    //{
      //  System.out.println("Student constructor");
    //}
    //如果自己没写 系统会给一个默认方法



    //重载
    //先写无参
    //再自定义带参的
    public Student(){}

        public Student(String name, int age)
        {
            this.name=name;
            this.age=age;

        }


}
