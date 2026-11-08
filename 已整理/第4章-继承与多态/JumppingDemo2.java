public class JumppingDemo2 {
    public static void main(String[] args) {
        JumppingOperator2 j = new JumppingOperator2();
        Jumpping1 jj=new Cat3();

        j.method(jj);

        j.method(new Jumpping1() {
            @Override
            public void jump() {
                System.out.println("猫可以跳高了");
            }
        });
    }
}
