import java.util.Scanner;

public class Demo20 {
    public static void main(String[] args) {
        // 创建Scanner对象，用于接收键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份(1-12)：");
        int month = sc.nextInt();

        // 使用switch语句判断季节
        //case穿透
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋");
                break;
            case 1:
            case 2:
            case 12:
                System.out.println("冬");
                break;
            default:
                System.out.println("输入的月份有误，请输入1-12之间的整数。");
                break;
        }
        // 关闭Scanner资源
        sc.close();
    }
}