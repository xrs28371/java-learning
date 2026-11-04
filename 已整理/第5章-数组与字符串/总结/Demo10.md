# Demo10 总结

## 练的知识点
- StringBuilder 的 append()、链式调用与 reverse()（第5章-数组与字符串）：`append` 向对象尾部添加数据并返回对象本身，`reverse()` 把当前字符序列反转。

## 关键结论
- `StringBuilder sb = new StringBuilder();` 先创建空对象，`StringBuilder sb2 = sb.append("hello");` 后 `sb` 与 `sb2` 指向同一个对象，输出都是 `hello`，不是两个独立副本。
- 随后连续 `append("hello")`、`append("world")`、`append(100)`，内容依次累积为 `hellohelloworld100`：`append` 可接受字符串，也可接受整数等任意类型，会先转成字符串再追加。
- 链式调用 `sb.append("hello").append("world").append("c").append("d")` 能成立，正是因为每次 `append` 返回的都是同一个对象，链下去就是在同一个对象上连续追加，最终内容为 `hellohelloworld100helloworldcd`。
- `sb.reverse()` 就地反转同一个对象，不产生新对象：反转后内容为 `dcdlrowolleh001dlrowolleholleh`。

## 笔试易错点
- 不要误以为 `sb2` 是 `sb` 的复制品：改其中一个（如再 `append` 或 `reverse`）会同时改变另一个，因为两者引用同一块对象；笔试问输出或问两者关系时要答「同一个对象」。
- `reverse()` 是就地修改、返回的也是自身，不要写成「返回了一个反转后的新 StringBuilder」；本题最后一次输出就是原 `sb` 被反转后的结果。
- 注释里的 `public StringBuilderappend(任意类型)` 是随手写的笔误，少了空格，正确写法是 `public StringBuilder append(任意类型)`；照抄进代码会编译报错，复习时只记含义：append 可接受任意类型、返回 StringBuilder 本身。
- 注意输出是逐步累积的：每次 `println` 打印的都是截至当时的内容，不能拿最终反转结果去倒推中间某次输出。
