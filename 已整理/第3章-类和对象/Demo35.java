public class Demo35 {
    public static void main(String[] args) {
        //方法概述
        //类似c中函数
        //先创建在使用
        //手动使用才执行
        isEvenNumber();

    }
    //方法体
     public static void isEvenNumber()

    {
       //定义变量
        int number =10;
        //判断是否偶数
        if(number%2==0)
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

}
