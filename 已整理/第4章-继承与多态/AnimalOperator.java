public class AnimalOperator {
    public static void main(String[] args) {
        //测试类
        AnimalDemo a =new AnimalDemo();
        Cat1 c =new Cat1();

        a.useAnimal(c);

        Animal a1 = a.getAnimal();//new Cat1();
        //通过多态来写的
        a1.eat();
        /*
        方法的形参是抽象类名，其实需要的是该抽象类的子类对象
        方法的返回值是抽象类名，其实返回的是该抽象类的子类对象
         */

    }
}
