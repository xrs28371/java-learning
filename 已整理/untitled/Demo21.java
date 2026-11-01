public class Demo21 {
    public static void main(String[] args) {
        //for循环
        //输出5次
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }

        for(int i=5;i>=1;i--)
        {
            System.out.println(i);
        }

        //求和
        int sum=0;
        for(int i=1;i<=5;i++)
        {
            sum+=i;
        }
        System.out.println(sum);

        //求偶数和
        int sum1=0;
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                sum1+=i;
            }
        }
        System.out.println(sum1);

        //水仙花
        //三位数  个 是 百 的数字立方和等于原数
        int a=0; //个
        int b=0; //十
        int c=0; //百
        for(int i=100;i<=999;i++)
        {
            if(i%10)
        }

    }
}
