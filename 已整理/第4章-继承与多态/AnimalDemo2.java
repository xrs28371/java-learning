public class AnimalDemo2 {
    /*
                向上转型
        从子到父
        父类引用指向子类对象
                向下转型
        从父到子
        父类引用转为子类对象
     */
    public static void main(String[] args) {
        //多态
        Animal2 a=new Cat2();//向上转型
        a.eat();


        /*
        //创建cat类对象
        Cat2 c =new  Cat2();
        c.eat();
        c.palygame();

         */

        //向下转型
        Cat2 c=(Cat2)a;
        c.eat();
        c.palygame();
        //这样就可以访问子类的特有功能
    }
}
