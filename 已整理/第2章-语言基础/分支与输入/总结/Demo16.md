# Demo16.java 内容总结

> 文件名是随手取的，以下按代码实际内容总结。

**主题：Scanner 键盘输入 + if-else 双分支——奇偶判断**

- 先用 `Scanner sc = new Scanner(System.in)` 创建键盘输入对象，提示“请输入一个整数”，用 `sc.nextInt()` 读入一个 int。
- 用取余判断奇偶：`number % 2 == 0` 成立打印“偶数”，否则走 else 打印“奇数”，二选一必走其一，是 if-else 格式 2 的标准应用。
- 相比上一版（只有空 main + Scanner import 骨架），本版已补全输入、判断、输出全流程，是一个完整可运行的小程序。

**笔试易错点**

- 奇偶判断用 `number % 2 == 0`，不是 `number / 2 == 0`（除法得商，几乎恒不为 0）；关系判断用 `==`，写成 `=` 会赋值且对 int 类型编译报错。
- `%` 是取余数：负数取余在 Java 里结果符号跟被除数一致（如 -3 % 2 == -1），但 `== 0` 的偶数判断对负数依然成立。
- `nextInt()` 只读整数：输入小数或字母会抛 InputMismatchException；`nextInt()` 后接 `nextLine()` 会吞掉换行读到空串，本例没接 nextLine，暂无此坑。
- 代码没有 `sc.close()`：小程序不影响运行，但规范写法用完应关闭；注意关闭 Scanner 也会关闭 System.in。
