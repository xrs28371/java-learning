public class Cat5 extends Animal5 {
    @Override
    public void eat() {
        //限定子类去重写
        System.out.println("eat fish");
    }
}
