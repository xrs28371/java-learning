import java.util.Random;
import java.util.Scanner;


public class Demo27027 {
    public static void main(String[] args) {
       //random随机数
        Random rand = new Random();
        int number = rand.nextInt(100)+1;//1到100随机数
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("请输入你要猜的数字：");
            int guessNumber = sc.nextInt();

            //比较输入的数字和系统产生的数据，需要使用分支语句。这里使用if..else..if..格式，根据不同情况进行猜测结果显示
            if (guessNumber > number) {
                System.out.println("你猜的数字" + guessNumber + "大了");
            } else if (guessNumber < number) {
                System.out.println("你猜的数字" + guessNumber + "小了");
            } else {
                System.out.println("恭喜你猜中了");
                break; // 猜中了，使用 break 结束循环
            }
        }



    }
}
