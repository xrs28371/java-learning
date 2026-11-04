# Demo1 总结

## 练的知识点
- API 的使用（第5章-数组与字符串）：用 `java.util.Scanner` 从键盘读入数据，`Scanner` 就是应用程序编程接口（API）的一个例子——别人写好的类，拿来直接用。
- `Scanner.nextLine()`：从键盘读入一整行文字，存进 `String` 变量。

## 关键结论
- 使用 Scanner 的固定三步：① `import java.util.Scanner;` 导包；② `Scanner s = new Scanner(System.in);` 创建对象（`System.in` 表示标准输入即键盘）；③ `s.nextLine()` 读一整行。
- 本例流程：提示 `Enter First Name: `，用 `nextLine()` 把整行输入存进 `line`，随后输出时用字符串拼接把 `line` 接在 `Enter Last Name: ` 后面打印。
- `nextLine()` 读的是「一整行」，含空格也一并读入；只想读一个单词（遇空格即停）要用 `next()`，两者不要混用。

## 笔试易错点
- 忘记导包就用 `Scanner` 会编译报错：`import java.util.Scanner;` 必须写在类定义之前。
- `new Scanner(System.in)` 里是 `System.in`（输入流），不是 `System.out`；写成 `out` 是典型笔误。
- `nextLine()` 的返回值是 `String`，接收变量必须声明为 `String` 类型。
- 注意本例最后一行只是把已读入的 `line` 拼进提示语打印出来，并没有再读一次输入；若题目问「程序读了几次输入」，答案是 1 次，不是 2 次。
- 变量名拼写：代码中 `Scanner s` 与 `s.nextLine()` 的 `s` 必须一致，大小写不同即为不同变量。
