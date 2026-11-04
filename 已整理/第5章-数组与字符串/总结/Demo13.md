# Demo13 总结

## 练的知识点
- 用 StringBuilder 实现字符串反转（第5章-数组与字符串）：键盘录入字符串，调用 myReverse 方法反转后输出。路线：String → StringBuilder（构造入参）→ reverse() 原地反转 → toString() 转回 String 返回。
- 方法分步写清每一步，注释里给了等价的一行链式写法：`return new StringBuilder(s).reverse().toString();`——能链起来是因为构造后 reverse() 返回对象本身、toString() 再转成 String。

## 关键结论
- 与 Demo8 的手动版对照：Demo8 是循环倒序 charAt 逐个拼接，Demo13 是 StringBuilder.reverse() 一步到位，两者结果等价；考试手写推荐 StringBuilder 版（短、不易错）。
- 转换顺序不能乱：String 不可变、没有 reverse()，必须先转 StringBuilder 才能反转，反完必须 toString() 转回 String 才能按 String 返回。
- reverse() 是原地修改 StringBuilder 本身，不生成新对象；这里 sb 转回 ss 后 sb 与 ss 内容相同但类型不同。

## 笔试易错点
- 忘记 toString()：方法声明返回 String 时，直接 return sb 会编译报错（类型不兼容），与 Demo11 里 `String s = sb;` 同一个坑。
- 别把 reverse() 误用到 String 上：String 类没有这个方法，写 s.reverse() 编译不过。
- 链式写法的求值方向：从左到右——先 new StringBuilder(s)，再 .reverse()，再 .toString()，笔试写运行结果时按这个顺序推。
