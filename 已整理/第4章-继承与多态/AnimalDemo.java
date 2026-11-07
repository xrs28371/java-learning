public class AnimalDemo {
    /*
    多态:
        同一个对象，在不同时刻表现出来的不同形态
        举例:猫我们可以说猫是猫:猫 cat=new 猫();
        我们也可以说猫是动物:动物 animal=new猫();
        这里猫在不同的时刻表现出来了不同的形态，这就是多态
        多态的前提和体现有继承/实现关系有方法重写有父类引用指向子类对象
     */
    public static void main(String[] args) {
        //有父类引用指向子类对象
        Animal a =new Cat();

        System.out.println(a.age);//40  通过多态是访问父类 编译运行都要看左边
      //  System.out.println(a.weight);  父类里面没有weight

        a.eat();// 输出子类的方法  多态下 编译看左边 运行看右边
        // a.palygame  一样都看左边 左边没有就报错
        //成员方法有重写 成员变量没有
    }
}
