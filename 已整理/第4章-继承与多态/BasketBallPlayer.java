public class BasketBallPlayer extends Player {
    @Override
    public void study() {
        System.out.println("TennisPlayer study");
    }

    @Override
    public void eat() {
        System.out.println("TennisPlayer eat");
    }

    public BasketBallPlayer(String name, int age) {
        super(name, age);
    }

    public BasketBallPlayer() {
    }
}
