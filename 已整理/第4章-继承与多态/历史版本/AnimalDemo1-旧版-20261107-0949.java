public class AnimalDemo1 {
    public static void main(String[] args) {
        //测试类

        //创建动物操作类的对象，调用方法
        AnimalOperater ao=new AnimalOperater();
        Cat c=new Cat();
        ao.useAnimal(c);
    }
}
