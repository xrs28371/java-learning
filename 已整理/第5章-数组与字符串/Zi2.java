public class Zi2 extends Fu2{
    public int age=20;
    public void show()
    {
        int age=30;
        System.out.println(age);
        //访问本类的成员age呢
        System.out.println(this.age);
        //访问父类的成员age呢
        System.out.println(super.age);
        //所以super就代表可以访问父类的成员变量

    }
}
