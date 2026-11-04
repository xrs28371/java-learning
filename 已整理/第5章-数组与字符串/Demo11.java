public class Demo11 {
    public static void main(String[] args) {
        //相互转换
        /*
        1.StringBuilder转换为 String
        public String toString0:通过 toString0就可以实现把 StringBuilder 转换为 String
        2. String 转换为 StringBuilder
        public StringBuilder(String s):通过构造方法就可以实现把 String转换为 StringBuilder
         */

        StringBuilder sb = new StringBuilder();
        sb.append("hello");


        //错误： String s=sb;

        String s=sb.toString();
        System.out.println(s);

        //String -> StringBuilder
        StringBuilder sb1=new StringBuilder(s);
        System.out.println(s);

    }
}
