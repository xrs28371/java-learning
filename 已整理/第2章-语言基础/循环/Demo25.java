public class Demo25 {
    public static void main(String[] args) {
        //跳转控制语句
        // continue 跳过某一次 继续下一次
        // break  中止 没有下一次
        for(int i=0;i<5;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.println(i);
        }

        for(int i=1;i<5;i++)
        {
            if(i%2==0)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
