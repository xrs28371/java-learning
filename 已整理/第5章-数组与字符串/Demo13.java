import java.util.Scanner;
public class Demo13 {
    public static void main(String[] args) {
        // 键盘录入一个字符串，用 Scanner 实现
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        String sss=myReverse(line);
        System.out.println(sss);

    }
    public static String myReverse(String s) {
        // 在方法中用 StringBuilder 实现字符串的反转，并把结果转成 String 返回
        // String --- StringBuilder --- reverse() --- String
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String ss = sb.toString();
        return ss;

        //等价于 return new StringBuilder(s).reverse().toString();
    }
}
