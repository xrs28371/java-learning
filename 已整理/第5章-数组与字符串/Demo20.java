public class Demo20 {
    //测试
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.setName("xrs");
        t1.setAge(20);
        System.out.println(t1.getName());
        System.out.println(t1.getAge());

        Teacher t2=new Teacher("xrs",33);
        System.out.println(t2.getName());
        System.out.println(t2.getAge());


    }
}
