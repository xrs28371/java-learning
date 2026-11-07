public class Cat8 extends Animal7 implements  Jumpping1{
    @Override
    public void eat() {
        System.out.println("cat8");
    }

    @Override
    public void jump() {
        System.out.println("cat88");
    }

    public Cat8(){

    }
    public Cat8(String name,int age){
        super(name,age);
    }
}
