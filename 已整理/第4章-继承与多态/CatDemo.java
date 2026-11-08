public class CatDemo {
    public static void main(String[] args) {
        //创建操作类对象，调用方法
        CatOperater a = new CatOperater();
        Cat c = new Cat();
        a.useCat(c);

        Cat e =new Cat();
        e=a.getCat();
        /*
        方法的形参是类名，其实需要的是该类的对象
        方法的返回值是类名，其实返回的是该类的对象
         */
    }
}
