import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        //案例用户登录
        //已经知道用户名和密码
        String name="xrs";
        String password="cjh";

        for(int i=0;i<3;i++)
        {
            //录入登录的用户名和密码
            Scanner sc = new Scanner(System.in);

            System.out.println("输入账号：");
            String usename = sc.nextLine();

            System.out.println("输入密码：");
            String psd = sc.nextLine();

            //比较
            if (name.equals(usename) && password.equals(psd)) {
                System.out.println("登陆成功");
            } else {
                if (2 - i == 0) {
                    System.out.println("账户已锁定");
                } else {
                    System.out.println("登录失败，你还有" + (2 - i) + "次机会");
                }
            }
        }

    }
}
