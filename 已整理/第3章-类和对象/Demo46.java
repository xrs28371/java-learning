public class Demo46 {
    public static void main(String[] args) {
        //多个对象
        StudentDemo s1=new StudentDemo();
        s1.name="xrs";
        s1.age=30;
        System.out.println("Name:"+s1.name);
        System.out.println("Age:"+s1.age);
        s1.study();
        s1.doHomework();

        //第二个对象并使用
        StudentDemo s2=new StudentDemo();
        s2.name="xrs";
        s2.age=30;
        System.out.println("Name:"+s2.name);
        System.out.println("Age:"+s2.age);
        System.out.println("Name:"+s1.name);
        System.out.println("Age:"+s1.age);
        s2.study();
        s2.doHomework();

    }
}
