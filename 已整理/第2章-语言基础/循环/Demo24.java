public class Demo24 {
    public static void main(String[] args) {
        //do while  先执行再判断
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<=5);

        //for 里面的自增归属for for结束无法被访问 while就可以
    }
}
