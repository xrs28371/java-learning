public class Demo43 {
    public static void main(String[] args) {
        //形参的改变是无法改变实参的值的
        int num=100;
        System.out.println(num);
        change(num);
        System.out.println(num);
    }
    public static void change(int num) {
        num=200;
    }
}
