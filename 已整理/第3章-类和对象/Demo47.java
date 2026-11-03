public class Demo47 {
    public static void main(String[] args) {
        //多个对象指向相同的内存
        StudentDemo a1=new StudentDemo();
        a1.name="xrs";
        a1.age=18;
        System.out.println("Name:"+a1.name);
        System.out.println("Age:"+a1.age);


        //把第一个对象的地址赋值给第二个对象
        StudentDemo a2=a1;
        a2.name="xrs";
        a2.age=18;
        System.out.println("Name:"+a2.name);
        System.out.println("Age:"+a2.age);

    }
}
