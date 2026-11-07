public class AnimalDemo7 {
    public static void main(String[] args) {
        //测试
        //创建对象
        Jumpping1 j =new Cat8();
        j.jump();

        Animal7 d =new Cat8();
        d.setName("xrs");
        d.setAge(18);
        System.out.println(d.getName()+" "+d.getAge());
        d.eat();
        //d.jump();


        d=new Cat8("xrs",100);
        System.out.println(
                d.getName()+" "+d.getAge()
        );
        d.eat();

        Cat8 c =new Cat8("xrs",100);
        System.out.println(c.getName()+" "+c.getAge());
        c.eat();
        c.jump();

        /*
        1.4类和接口的关系
        类和类的关系继承关系，只能单继承，但是可以多层继承
        类和接口的关系
        接口和接口的关系继承关系，可以单继承，也可以多继承
        实现关系，
        可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口
         */

    }
}
