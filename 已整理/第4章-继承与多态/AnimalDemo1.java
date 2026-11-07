public class AnimalDemo1 {
    public static void main(String[] args) {
        //测试类

        //创建动物操作类的对象，调用方法
        AnimalOperater ao=new AnimalOperater();
        Cat c=new Cat();
        ao.useAnimal(c);

        Dog d=new Dog();
        ao.useAnimal(d);

        //添加很多动物
        //多态是无法访问子类的特有功能
        //但是提高了程序的扩展性
    }
}
