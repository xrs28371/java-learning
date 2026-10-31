public class Demo08 {
    public static void main(String[] args) {
        //逻辑运算符
        // & |
        //定义变量
        int i=10;
        int j=20;
        int k=30;

        //&
        System.out.println((i>j)&(i>k));//false & false
        System.out.println((i<j)&(i>k));//true& false
        System.out.println((i>j)&(i<k));
        System.out.println((i<j)&(i<k));
        // 都是true才为true

        //|
        System.out.println((i>j)|(i>k));//false | false
        System.out.println((i<j)|(i>k));//true  | false
        System.out.println((i>j)|(i<k));
        System.out.println((i<j)|(i<k));
        //有true为true 都false才是false


        //^
        System.out.println((i>j)^(i>k));
        System.out.println((i<j)^(i>k));
        System.out.println((i>j)^(i<k));
        System.out.println((i<j)^(i<k));
        //相同为false 不同为true


        //！  相反
       System.out.println((i>j));
       System.out.println(!(i>j));



    }
}
