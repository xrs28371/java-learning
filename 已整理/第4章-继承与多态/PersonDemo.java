public class PersonDemo {
    public static void main(String[] args) {
        //测试
        TennisPlayer p = new TennisPlayer();
        p.setName("xrs");
        p.setAge(18);
        System.out.println(p.getName()+p.getAge());

        p.eat();
        p.study();
        p.speak();


        BasketBallPlayer b = new BasketBallPlayer();
        b.setName("xrs");
        b.setAge(18);
        System.out.println(b.getName()+b.getAge());
        b.eat();
        b.study();

    }
}
