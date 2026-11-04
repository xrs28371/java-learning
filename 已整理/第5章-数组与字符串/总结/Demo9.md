# Demo9 总结

## 练的知识点
- StringBuilder 的构造方法与 length()（第5章-数组与字符串）：无参构造创建空的可变字符串对象，带 String 参数的构造创建初始内容为该字符串的对象，并用 `length()` 查看当前字符个数。

## 关键结论
- `new StringBuilder()` 得到空对象：输出 `sb:` 后面是空，`sb.length()` 为 0。
- `new StringBuilder("hello")` 得到初始内容为 `hello` 的对象：输出 `sb2:hello`，`sb2.length()` 为 5。
- 本轮更新后这份代码已从上一版的空类骨架长出完整 `main` 方法：两次构造、两次输出对照，属可运行的构造方法入门示例。
- `length()` 返回的是当前实际字符数，不是容量；空串长度 0、"hello" 长度 5，不要和数组的 `length` 属性（无括号）混淆。

## 笔试易错点
- `StringBuilder` 的 `length()` 是方法、必须带括号；写成 `sb.length` 编译报错。数组长度才是属性 `arr.length`（无括号）。
- StringBuilder 内容可变、String 不可变：这是本章对比考点，构造后 `append`、`reverse` 等操作改的是同一个对象，不会像 String 拼接那样每次产生新对象。
- 输出拼接时 `System.out.println("sb:" + sb)` 会自动调用 `toString()`，所以直接打印对象就能看到内容；不要误以为打印对象只会出地址。
