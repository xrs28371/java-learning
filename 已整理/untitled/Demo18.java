import java.util.Scanner;
public class Demo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        // 1. 优先排除所有不合法的分数
        if (score < 0 || score > 100) {
            System.out.println("输入错误");
        }
        // 2. 剩下的都是 0~100 的合法分数，按区间判断即可
        else if (score >= 95) {
            System.out.println("山地自行车");
        }
        else if (score >= 90) {
            System.out.println("游乐场");
        }
        else if (score >= 80) {
            System.out.println("变形金刚");
        }
        else {
            System.out.println("胖揍一顿");
        }
    }
}
