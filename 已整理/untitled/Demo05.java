public class Demo05 {
    public static void main(String[] args) {
        //赋值运算符
        // = 赋值  a=10  将10赋值给a
        int a=10;
        System.out.println("a:"+a);

        //+=
        a+=10;
        System.out.println("a:"+a);
        //  a=a+10

        //注意
        short s=10;
        s+=20;
        System.out.println("s:"+s);
        //但是 s=s+20 是不可以的
        //要写成如下
        s=(short)(s+10);
        System.out.println("s:"+s);



    }
}
