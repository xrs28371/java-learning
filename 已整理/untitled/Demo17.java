import java.util.Scanner;
public class Demo17 {
    public static void main(String[] args) {
        //if语句格式3
        // if elseif else
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入一个星期数（1~7）：");
        int week=sc.nextInt();

        if(week==1)
        {
            System.out.println("星期一");
        }
        else if(week==2)
        {
            System.out.println("星期二");
        }
        else if(week==3)
        {
            System.out.println("星期三");
        }
        else if(week==4)
        {
            System.out.println("星期四");
        }
        else if(week==5)
        {
            System.out.println("星期五");
        }
        else if(week==6)
        {
            System.out.println("星期六");
        }
        else{
            System.out.println("星期日");
        }


    }
}
