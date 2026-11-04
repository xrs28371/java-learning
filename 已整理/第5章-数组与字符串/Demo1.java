import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //API
        //应用程序编程接口
        Scanner s=new  Scanner(System.in);

        //接受数据
        System.out.print("Enter First Name: ");
        String line=s.nextLine();
        //从键盘读入一整行文字，存进变量line，后面代码再拿line去处理
        //让程序能拿到「人输入的一整句话」

        //输出数据
        System.out.print("Enter Last Name: "+line);
    }
}
