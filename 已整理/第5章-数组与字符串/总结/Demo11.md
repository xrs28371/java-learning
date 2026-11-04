# Demo11 总结

## 练的知识点
- String 与 StringBuilder 之间的相互转换（第5章-数组与字符串）：`StringBuilder` 转 `String` 用 `toString()`，`String` 转 `StringBuilder` 用构造方法 `new StringBuilder(字符串)`。

## 关键结论
- 本版已由上一版的空壳补成完整示例：`sb.append("hello")` 后，`String s = sb.toString();` 把 StringBuilder 的内容转成 String，输出 `hello`。
- 反方向：`new StringBuilder(s)` 用已有字符串构造 StringBuilder；本例中 `sb1` 即由此得到（但注意第二次 `println` 打印的是 `s` 而不是 `sb1`，所以程序两次输出都是 `hello`）。
- 代码里自己标注了错误写法：`String s = sb;` 是错的——StringBuilder 与 String 是不同类型，不能直接赋值，必须经过 `toString()` 转换。

## 笔试易错点
- 方向不要写反：`toString()` 是 StringBuilder → String；`new StringBuilder(str)` 是 String → StringBuilder；笔试问「怎么把 StringBuilder 转成 String」要答 `toString()`，不要答构造方法。
- `toString()` 必须带括号：注释里写的 `toString0` 是笔误（把括号写成了 0），照抄进代码会编译报错，正确写法是 `sb.toString()`。
- `String s = sb;` 这类直接赋值在笔试改错题里是典型错误：两种类型之间没有自动转换，必须显式调用转换方法。
- 文件名 Demo11 没有含义：判断练什么只看代码内容，本版内容就是两种转换，不要凭文件名脑补其他知识点。
