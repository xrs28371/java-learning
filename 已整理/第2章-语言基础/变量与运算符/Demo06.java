public class Demo06 {
    public static void main(String[] args){
        //自增自减运算符
        // ++  --
        int i=10;
        System.out.println("i:"+i);


        //单独使用 前后无所谓
        i++;
        System.out.println("i:"+i);
        ++i;
        System.out.println("i:"+i);

        //参与操作使用
        int j=i++;
        System.out.println("i:"+i);
        System.out.println("j:"+j);
        //先使用后++

        int h=++i;
        System.out.println("i:"+i);
        System.out.println("h:"+h);
        //先++后使用

    }
}
