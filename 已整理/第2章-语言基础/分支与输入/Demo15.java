public class Demo15 {
    public static void main(String[] args) {
        //流程控制语句概述
        //顺序结构
        //分支结构
        //循环结构


        //顺序结构
        System.out.println("开始");

        System.out.println("语句A");
        System.out.println("语句A");
        System.out.println("语句A");

        System.out.println("结束");

        //if语句
        /*
        if（关系表达式）{
        语句体；
        }
        */
        System.out.println("开始");

        int a=10;
        int b=20;

        if(a==b)
        {
            System.out.println("a==b");
        }
        int c=10;
        if(a==c)
        {
            System.out.println("a==c");

        }

        System.out.println("结束");

        //if语句格式2
        //if  else
        int aa=10;
        int bb=20;
        if(aa>bb)
        {
            System.out.println("aa>bb");
        }
        else{
            System.out.println("aa<bb");
        }
        System.out.println("结束");



    }
}
