public class Demo10 {
    public static void main(String[] args) {
        //三元运算符
        //格式：关系表达式？表达式：表达式
        //a>b?a:b
        // 首先计算关系表达式
        //  值为true 表达式1就是运算结果
        //   值为false 表达式2就是运算结果

        int a=10;
        int b=20;

        int max=a>b?a:b;
        //获取较大值

        System.out.println(max);
        //输出结果

    }
}
