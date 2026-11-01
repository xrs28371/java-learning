public class Demo23 {
    public static void main(String[] args) {
        // 定义珠穆朗玛峰的高度，单位：毫米
        double everestHeight = 8844430;
        // 定义纸张的初始厚度，单位：毫米
        double paperThickness = 0.1;
        // 定义折叠次数计数器
        int count = 0;

        // 当纸的厚度小于珠穆朗玛峰的高度时，继续折叠
        while (paperThickness < everestHeight) {
            // 每次折叠，纸的厚度翻倍
            paperThickness *= 2;
            // 折叠次数加1
            count++;
        }

        // 输出最终折叠次数
        System.out.println("需要折叠 " + count + " 次，才能折成珠穆朗玛峰的高度。");
    }
}