import java.util.Arrays;

public class Demo44 {
    public static void main(String[] args) {
        //对于引用类型的参数 形参的改变 影响实际参数的值
        int arr[]={10,20,30};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
    }
    public static void change(int arr[])
    {
        arr[1]=200;
    }
}
