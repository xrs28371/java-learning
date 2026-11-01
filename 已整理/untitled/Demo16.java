import java.util.Scanner;
public class Demo16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number=sc.nextInt();
        if(number%2==0)
        {
            System.out.println("偶数");
        }
        else{
            System.out.println("奇数");

        }
    }
}
