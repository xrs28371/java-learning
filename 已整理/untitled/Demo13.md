# Demo13.java 内容总结

> 文件名是随手取的，以下按代码实际内容总结。

**主题：数据输入 Scanner 入门**

- 三步走：`import java.util.Scanner;` 导包 → `Scanner sc = new Scanner(System.in);` 创建对象 → `int x = sc.nextInt();` 读取键盘输入的整数，最后把 x 打印出来。
- 备考提醒：以后用 `nextLine()` 读字符串时注意自测单 (g) 题的坑——`nextInt()` 后紧跟 `nextLine()` 会把残留的换行符吞掉，需要多调一次 `nextLine()` 清掉。
