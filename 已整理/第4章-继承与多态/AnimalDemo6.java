public class AnimalDemo6 {
    public static void main(String[] args) {
        //测试类
        Animal6 a=new Cat6();
        a.setName("xra");
        a.setAge(18);
        System.out.println(a.getName()+a.getAge());
        a.eat();

        a=new Cat6("xra",10000);
        System.out.println(a.getName()+a.getAge());
        a.eat();

        //Dog
        Animal6 d=new Dog2();
        d.setName("xrs");
        d.setAge(18);
        System.out.println(d.getName()+d.getAge());
        d.eat();

       d=new Dog2("xrs",10);
        System.out.println(d.getName()+d.getAge());
        d.eat();



    }
}
