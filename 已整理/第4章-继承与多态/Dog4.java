public class Dog4 extends Animal7 implements Jumpping1{
    @Override
    public void eat() {
        System.out.println("Dog4 is eating");
    }

    @Override
    public void jump() {
        System.out.println("Dog4 is jumping");
    }
    public  Dog4(){

    }
    public  Dog4(String name,int age){
        super(name,age);
    }
}
