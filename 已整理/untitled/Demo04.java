public class Demo04 {
    public static void main(String[] args) {
        //运算符和表达式

        //运算符  ： 对常量或者变量进行操作的符号
        //表达式： 用运算符把常量或者变量连接起来的复合java语法的式子就可以称为表达式
        //    不同运算符连接的表达式体现的式不同类型的表达式

        //例如
        int a=100;
        int b=20;
        int c=a+b;
        System.out.println(c);
        //  + 是运算符 并且是算术运算符
        //a+b 是表达式 ， 由于+是算术运算符 ，所以表达式也叫算术表达式


        //符号  +  -  *  /  %
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //整数的运算只能得到整数结果
        //如果想要得到小数 必须有浮点数参与

        //+操作
        int i=10;
        char e='A';  //遵守了ASCII

        //用什么类型去接受这个 i+e 结果呢
        //当包含多个基本数据类型  整个表达式会自动提升
        // byte,short,char ->int ->long ->float ->double

        //显然这里拿int 来接受
        int j=i+e;
        System.out.println(i+e);
        System.out.println(j);


        //字符串的 ” + ”操作
        System.out.println("cjh"+"xrs");
        System.out.println("xrs"+666666);
        System.out.println(666666+"xrs");
        //进行了拼接作用









    }
}
