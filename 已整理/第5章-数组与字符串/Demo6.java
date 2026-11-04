import java.util.Scanner;
public class Demo6 {
    public static void main(String[] args) {
        //统计字符次数
        /*
        思路:
        1键盘录入一个字符串，用Scanner实现
        要统计三种类型的字符个数，需定义三个统计变量，初始值都为0
        遍历字符串，得到每一个字符
        判断该字符属于哪种类型，然后对应类型的统计变量+1
        假如ch是一个字符，我要判断它属于大写字母，小写字母，还是数字，直接判断该字符是否在对应的范围即可
        大写字母:ch>='A'&&ch<='Z'
        小写字母:ch>='a'&&ch<='z'
        数字:ch>='0'&&ch<='9'
        5输出三种类型的字符个数
         */

        Scanner sc=new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line=sc.nextLine();

        int bigcount=0;
        int smallcount=0;
        int numbercount=0;

        for(int i=0;i<line.length();i++)
        {
            char ch=line.charAt(i);

            if(ch>='A'&&ch<='Z')
            {
                bigcount++;
            }
            else if(ch>='a'&&ch<='z')
            {
                smallcount++;
            }
            else if(ch>='0'&&ch<='9')
                {
                numbercount++;
                }
        }
        System.out.println("大写字母："+bigcount+"个");
        System.out.println("小写字母"+smallcount+"个");
        System.out.println("数字"+numbercount+"个");
    }
}
