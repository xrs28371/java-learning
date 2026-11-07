public abstract class Animal7 {
    private String name;
    private int age;

    public Animal7(){

    }
    public Animal7(String name,int age){
        this.name=name;
        this.age=age;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public abstract void eat();


}
