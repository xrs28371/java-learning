public class AnimalDemo4 {
    public static void main(String[] args) {
        //Animal4 a=new Animal4();
        //如何创建对象

        Animal4 a=new Cat4();
        a.eat();
        a.sleep();
        //抽象类要通过子类来访问

        //子类要么重写抽象方法
        //要么也是抽象类
    }
}
