public class Cat3 extends Animal3{
    public Cat3(){

    }
    public Cat3(String name ,int age){
        super(name,age);//在子类构造器里调用父类构造器。`super()` 就是调用父类的无参构造器。
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
