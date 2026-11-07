public class InterfaceDemo {
    public static void main(String[] args) {
        //cs
        Inter i=new Interlmpl();
       // i.num=20;
        //不是常量 为什么？
        //接口中都是常量 默认被final修饰
        System.out.println(i.num);
       // i.num2=40;
        System.out.println(i.num2);
        System.out.println(Inter.num);
    }

    /*
    1.3接口的成员特点
    成员变量
    只能是常量
    默认修饰符:public static final
    构造方法
    接口没有构造方法，因为接口主要是对行为进行抽象的，是没有具体存在
    成员方法
    一个类如果没有父类，默认继承自Object类:
    只能是抽象方法
    默认修饰符:public abstract
     */
}
