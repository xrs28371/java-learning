# Demo40 总结

## 练的知识点
- **带返回值的方法（int 返回值）与 Demo38 的对比**：定义 `getMax(int a, int b)`，用 `if-else` 比较，`a > b` 时 `return a`，否则 `return b`；`main` 里 `int result = getMax(10, 20);` 接住返回值再 `System.out.println(result)`，输出 `20`。

## 关键结论
- 和 Demo38 的 void 版 `getMax` 是同一道题的两种写法，差别只在结果的去向：Demo38 在方法里直接打印，算完就没了；这里把结果 `return` 出来交给 `main`，`main` 拿到 `result` 后还能继续用（打印、比较、计算都行），复用性更强。
- 带返回值的方法必须保证每条执行路径都有 `return`：这里 `if-else` 两分支各一个 `return`，正好全覆盖；如果只写 `if (a > b) return a;` 而没有 `else`，编译器会报“缺少返回语句”。

## 笔试易错点
- 返回值类型要与方法声明一致：声明是 `int getMax`，两个分支就都得 `return` 一个 `int`，`return` 一个 double 或字符串会编译报错。
- `return a;` 后面的分号不能漏；`return` 一执行就退出方法，写在 `return` 后面的语句是到不了的死代码，编译会报错。
- 调用时同样要个数、类型、顺序都对：`getMax(10, 20)` 两个 `int` 对应两个 `int` 形参；少传、多传、传小数都会编译报错。
