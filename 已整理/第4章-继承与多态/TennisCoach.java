public class TennisCoach extends Coach implements English{
    @Override
    public void teach() {
        System.out.println("TennisCoach teach how tu play");
    }

    @Override
    public void eat() {
        System.out.println("TennisCoach eat rice");
    }

    @Override
    public void speak() {
        System.out.println("TennisCoach speak English");
    }

    public TennisCoach() {
    }

    public TennisCoach(String name, int age) {
        super(name, age);
    }
}
