public class Demo41 {
    public static void main(String[] args) {
        //方法不能嵌套定义
        //void是没有返回值的


        //方法重载
        //多个方法再同一个类中
        //相同方法名
        //参数不相同，类型不同或者数量不同



        //调用方法
        int result =sum(10,20);
        System.out.println(result);
        double result1=sum(10.0,20.0);
        System.out.println(result1);
        int result2=sum(10,20,30);
        System.out.println(result2);
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
}
