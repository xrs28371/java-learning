public class BasketballCoach extends Coach {
    @Override
    public void teach() {
        System.out.println("Basketball Coach teach how tu get score");
    }

    @Override
    public void eat() {
        System.out.println("Basketball Coach eat milk and meat");
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    public BasketballCoach() {
    }
}
