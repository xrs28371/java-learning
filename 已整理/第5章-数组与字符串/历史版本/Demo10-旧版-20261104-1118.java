public class Demo10 {
    public static void main(String[] args) {
        /*
        public StringBuilderappend(任意类型)
        public StringBuilderreverse()
        添加数据，并返回对象本身
        返回相反的字符序列
         */

        //创建对象
        StringBuilder sb=new StringBuilder();

        StringBuilder sb2=sb.append("hello");
        //添加数据，并返回对象本身

        System.out.println("sb:"+sb);
        System.out.println("sb2:" + sb2);
        
    }
}
