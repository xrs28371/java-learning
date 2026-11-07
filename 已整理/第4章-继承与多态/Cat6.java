public class Cat6 extends Animal6{
    @Override
    public void eat() {
        System.out.println("eat fish");
    }
    public Cat6(){

    }
    public Cat6(String name,int age){
        super(name,age);
    }
}
