# Demo10 总结

## 练的知识点
- StringBuilder 的 append() 方法与返回值（第5章-数组与字符串）：`append` 向对象尾部添加数据，并返回对象本身；用另一个变量接收返回值时，两个变量指向同一个对象。

## 关键结论
- `StringBuilder sb = new StringBuilder();` 先创建空对象，再 `sb.append("hello")`，此时 `sb` 的内容变为 `hello`。
- `append` 返回的是对象本身（`return this` 的效果），所以 `StringBuilder sb2 = sb.append("hello");` 执行后 `sb` 与 `sb2` 是同一个对象，输出都是 `hello`，不是两个独立副本。
- 因此 `sb.append("a").append("b")` 可以链式调用：每次返回的都是同一个对象，链下去就是在同一个对象上连续追加。

## 笔试易错点
- 不要误以为 `sb2` 是 `sb` 的复制品：改 `sb2`（如再 `append`）会同时改变 `sb`，因为两者引用同一块对象；笔试问输出或问两者关系时要答「同一个对象」。
- 注释里的 `public StringBuilderappend(任意类型)` 是随手写的笔误，少了空格，正确写法是 `public StringBuilder append(任意类型)`；照抄进代码会编译报错，复习时只记含义：append 可接受任意类型、返回 StringBuilder 本身。
- 注释里还把 `reverse()` 的说明写在本题里，但代码中并未调用 `reverse()`：不要把注释当成代码已实现的功能，判断练了什么只看实际执行到的语句。
