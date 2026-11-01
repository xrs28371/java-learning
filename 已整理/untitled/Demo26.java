public class Demo26 {
    public static void main(String[] args) {
        //循环嵌套
        //输出一天的小时和分钟
        for (int hour = 0; hour <= 24; hour++) {

            // 内层循环控制分钟，从0到59
            for (int min = 0; min < 60; min++) {

                System.out.println(hour + "时" + min + "分");

            }
        }

    }
}
