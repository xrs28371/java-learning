public class Demo12 {
    public static void main(String[] args) {
        //SringBuilder 拼接字符串


        /*
        思路:
        定义一个int类型的数组，用静态初始化完成数组元素的初始化在方法中用StringBuilder按照要求进行拼接，并把结果转成String返回
        定义一个方法，用于把int数组中的数据按照指定格式拼接成一个字符串返回。返回值类型String，参数列表int[]arr
        调用方法，用一个变量接收结果
        输出结果
         */
        int arr[] = {1, 2, 3};
        String s=arrayToString(arr);

        System.out.println(s);


    }

    public static String arrayToString(int[] arr) {
        // 在方法中用 StringBuilder 按照要求进行拼接，并把结果转成 String 返回
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }

        sb.append("]");

        String s = sb.toString();

        return s;
    }
}

