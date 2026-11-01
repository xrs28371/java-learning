# Demo16.java 内容总结

> 文件名是随手取的，以下按代码实际内容总结。

**主题：输入模板——Scanner 骨架已搭好，正文尚未写**

- 相比上一版（只有空类 + 默认包名占位符），本版已补上 `public static void main(String[] args)`，并在文件首行引入 `import java.util.Scanner;`，显然是在为键盘输入练习搭骨架。
- 但 main 方法体目前仍是空的：没有创建 Scanner 对象、没有 `nextInt()`/`nextLine()` 之类的读取调用、也没有输出，运行后什么都不做、不读任何输入。
- 上一版的 `package PACKAGE_NAME;` 已去掉，当前文件无包声明，放在 src 根目录下编译运行无包目录问题。

**笔试易错点**

- `import java.util.Scanner;` 只是引入类，不等于已使用：当前代码并未真正用到 Scanner，编译能过（未使用的 import 只是警告、不报错），但考试若要求“键盘输入”必须补上 `Scanner sc = new Scanner(System.in);` 及读取语句，光 import 不得分。
- 空 main 方法可以正常运行，只是无任何输出；别误以为“没报错 = 程序已完成输入逻辑”。
- 后续补代码时注意 Scanner 的常见坑：`nextInt()` 后接 `nextLine()` 会吞掉换行导致读到空串；用完 Scanner 一般 `sc.close()`，但关闭后 System.in 也随之关闭。
