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
    }
}
