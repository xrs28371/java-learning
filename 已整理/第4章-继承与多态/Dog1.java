public class Dog1 extends Animal3{

    public Dog1(){

    }
    public Dog1(String name,int age){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
