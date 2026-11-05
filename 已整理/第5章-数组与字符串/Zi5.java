public class Zi5 extends Fu5 {
        //
    @Override//检查方法重写
        public void call(String name){
            System.out.println("开启视频功能");
            //System.out.println("给"+name+"打电话");
            super.call(name);
        }

        //一模一样的方法 方法重写

    //子类无法重写父类的私有方法
    //私有方法只能在类内部调用
    //或者在外面套一层public public里面调用private 然后才能调用私有在其他类里面
}
