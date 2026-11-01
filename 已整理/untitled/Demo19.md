# Demo19.java 内容总结

> 文件名是随手取的，以下按代码实际内容总结。

**主题：switch 多分支——数字 1~7 对应星期一到星期日**

- 用 Scanner 读入一个整数 n，用 `switch (n)` 做 7 路分支：case 1~7 分别打印“星期一”到“星期日”，default 打印“输入错误”。
- 每个 case 后都跟了 break，是最标准的 switch 写法，与 Demo20 的 case 穿透写法正好对照。

**关键结论**

- switch 的匹配是“值相等即进入”：n 等于几就进对应 case，与 if-else 的区间判断不同，这里每个 case 都是单个常量值，不能写范围。
- break 的作用是跳出 switch：命中某个 case 执行完后必须 break，否则会穿透到下一个 case 继续打印，直到遇到 break 或 switch 结束。
- default 承接所有未列出的值：本例中 1~7 之外的任何整数（包括 0、负数、8 以上）都走 default，不要把 default 理解成只处理“非法输入”的校验——它只是“以上皆非”的兜底分支。

**笔试易错点**

- 漏写 break 是 switch 第一大坑：去掉某 case 的 break 后，该 case 会连带打印后续 case 的内容，例如 n=1 会一路打印到星期日；考试给出去掉 break 的代码问输出，要按穿透顺序逐行算。
- switch 的表达式类型有限：int、char、String、枚举等可用，long、float、double、boolean 不能做 switch 表达式，写错类型直接编译失败。
- case 后只能跟常量，不能跟变量或范围表达式；case 1、case 2 这种字面常量才是合法写法。
- 注意本文件的小瑕疵：用完 Scanner 后没有 sc.close()，与 Demo20 显式 close 形成对照；小程序无碍，但规范写法是用完关闭资源。
