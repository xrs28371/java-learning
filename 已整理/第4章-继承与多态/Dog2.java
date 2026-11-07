public class Dog2 extends Animal6 {
    @Override
    public void eat() {
        System.out.println("dog eat");
    }

    public Dog2(){

    }
    public Dog2(String name,int age){
        super(name,age);
    }
}
