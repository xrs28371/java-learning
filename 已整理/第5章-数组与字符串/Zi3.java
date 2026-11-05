public class Zi3 extends Fu3 {
    public Zi3()
    {
        super();
        System.out.println("Zi中无参构造方法被调用");
    }
    public Zi3(int age)
    {
        super();
        //如果父类没有无参
        //super（20）；
        System.out.println("Zi中有参构造方式被调用");

    }
}
