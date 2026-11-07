public abstract class Animal5 {
    private int age=20;
    private final  String name="xrs";

    public Animal5() {
        
    }

    public void show(){
        age=40;
        System.out.println(age);
        // name="cjh";
        System.out.println(name);
    }

    public abstract void eat();

}
