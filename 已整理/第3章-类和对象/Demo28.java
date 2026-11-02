public class Demo28 {
    public static void main(String[] args) {
        int arr[]=new int[3];
        //输出数组名及元素  初始化会默认给你0
        System.out.println(arr);
        System.out.println("arr[0]="+arr[0]);
        System.out.println("arr[1]="+arr[1]);
        System.out.println("arr[2]="+arr[2]);

        arr[0]=200;
        arr[2]=200;
        System.out.println("arr[0]="+arr[0]);
        System.out.println("arr[1]="+arr[1]);
        System.out.println("arr[2]="+arr[2]);


    }
}
