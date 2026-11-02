public class Demo32 {
    public static void main(String[] args) {
        //索引越界
        //空指针异常
        //null 空值
        int arr[]=new int[3];
        System.out.println(arr[3]);//越界

         arr=null;
         System.out.println(arr[0]);
         //空指针
    }
}
