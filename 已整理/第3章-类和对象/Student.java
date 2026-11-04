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
}
