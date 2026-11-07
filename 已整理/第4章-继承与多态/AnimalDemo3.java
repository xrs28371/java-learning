public class AnimalDemo3 {
    public static void main(String[] args) {
        //创建猫
        Animal3 a=new Cat3();
        a.setName("xrs");
        a.setAge(100);
        System.out.println(a.getName()+a.getAge());
        a.eat();

        a=new Cat3("xrs",1000);
        a.eat();
        System.out.println(a.getName()+a.getAge());
    }
}
