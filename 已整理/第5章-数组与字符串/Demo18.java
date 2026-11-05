public class Demo18 {
    public static void main(String[] args) {
        Zi4 z=new Zi4();
        z.method();
        z.show();//首先在子里面去找，如果子没有去父类找
        //z.test();  报错


        //通过子类对象访问一个方法
        // 1.子
        //2.父
        // 3.报错
    }
}
