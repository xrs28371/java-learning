public class TennisPlayer extends Player implements   English{
    @Override
    public void study() {
        System.out.println("TennisPlayer study");
    }

    @Override
    public void eat() {
        System.out.println("TennisPlayer eat");
    }

    @Override
    public void speak() {

        System.out.println("TennisPlayer speak English");
    }

    public TennisPlayer(String name, int age) {
        super(name, age);
    }

    public TennisPlayer() {
    }
}
