public class Demo17 {
    public static void main(String[] args) {
        //创建对象
        Zi3 zi3 = new Zi3();

        Zi3 zi31 = new Zi3(30);

        //为什么都先访问父类的无参构造方法

        //默认先访问
        //子继承父，可能会用父类的数据。所以子类初始化前先进行父类
        //每一个子类构造方法第一句默认是：super();
    }
}
