import java.util.Scanner;
public class Demo5 {
    public static void main(String[] args) {
        //遍历字符串
        //键盘录入一个字符串，用Scanner实现
        /*
        遍历字符串，首先要能够获取到字符串中的每一个字符
        遍历字符串，其次要能够获取到字符串的长度
        public char charAt(int index):返回指定索引处的char值，字符串的索引也是从0开始的
        publicint length():返回此字符串的长度
        数组的长度:数组名.length
        字符串的长度:字符串对象.length0
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入字符串：");
        String line =sc.nextLine();

        //获取长度
        System.out.println(line.length());

        //遍历
        for(int i=0;i<line.length();i++)
        {
            System.out.println(line.charAt(i));
        }
    }
}
