public class Demo09 {
    public static void main(String[] args){
        //短路计算符
        // && 短路与
        // || 短路或
        //定义变量
        int i=10;
        int j=20;
        int k=30;

        //&&
        System.out.println((i>j)&&(i>k));//false & false
        System.out.println((i<j)&&(i>k));//true& false
        System.out.println((i>j)&&(i<k));
        System.out.println((i<j)&&(i<k));
        // 都是true才为true

        //||
        System.out.println((i>j)||(i>k));//false | false
        System.out.println((i<j)||(i>k));//true  | false
        System.out.println((i>j)||(i<k));
        System.out.println((i<j)||(i<k));
        //有true为true 都false才是false

        //&&和& 有什么区别呢
        System.out.println((i++>100)&(j++>100));
        System.out.println((i++>100)&&(j++>100));
        System.out.println("i:"+i);
        System.out.println("j:"+j);
        //&& 只要左边是false 右边不执行
        //|| 只要左边为true  右边不执行
    }
}
