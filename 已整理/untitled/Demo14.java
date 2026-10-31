import java.util.Scanner;
public class Demo14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // 三个和尚升级版
        System.out.println("请输入第一个和尚的身高：");
        int a=sc.nextInt();

        System.out.println("请输入第二个和尚的身高：");
        int b=sc.nextInt();

        System.out.println("请输入第三个和尚的身高：");
        int c=sc.nextInt();

        int d=a>b?a:b;

        int e=c>d?c:d;

        System.out.println("这三个和尚中身高最高的是:"+e+"cm");

    }
}
