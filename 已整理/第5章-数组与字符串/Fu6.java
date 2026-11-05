public class Fu6 {
    private void show1() {
        System.out.println("private");
    }

    void show2() {
        System.out.println("默认");
    }

    protected void show3() {
        System.out.println("protected");
    }

    public void show4() {
        System.out.println("public");
    }

    public static void main(String[] args) {
        //创建Fu的对象，测试看有哪些方法可以使用
        Fu6 f = new Fu6();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}




