public class Demo2 {
    public static void main(String[] args) {
        //String
        //字符串
        //""以内全是字符串对象


        //字符串的特点
        //1.不可变 创建后无法被改变
        //2.虽然String值是不可变的，但是题目可以被共享
        //3.字符串效果上相当于字符数组 ，但是底层原理是字节数组(byte[])


        //构造方法

        //空白字符串对象
        String s1 =new String();
        System.out.print("s1: "+s1);

        //根据字符数组
        char cha[]={'a','b','c'};
        String s2=new String(cha);
        System.out.print("s2: "+s2);

        //字节数组
        byte bys[]={92,34,23,42};
        String s3=new String(bys);
        System.out.print("s3: "+s3);

        //直接赋值
        String s4="abc";
        System.out.print("s4: "+s4);

        //推荐使用直接赋值得到字符串对象



    }
}
