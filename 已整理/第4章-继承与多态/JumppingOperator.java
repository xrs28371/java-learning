public class JumppingOperator {
    public static void main(String[] args) {
        //测试
        JummpingDemo a =new JummpingDemo();
        Jumpping j =new Cat2();
        j.jump();

        //多态
        a.useJumpping(j);
        Jumpping j2 = a.getJumpping();
        j2.jump();

        /*
        方法的形参是接口名，其实需要的是该接口的实现类对象
        方法的返回值是接口名，其实返回的是该接口的实现类对象
         */

    }
}
