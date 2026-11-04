# Demo12 总结

## 练的知识点
- 用 StringBuilder 把 int 数组按指定格式拼接成字符串（第5章-数组与字符串）：方法 `arrayToString(int[] arr)` 返回 `"[1, 2, 3]"` 这种格式，练的是 StringBuilder 拼接 + 循环边界控制。

## 关键结论
- 主方法：`int arr[] = {1, 2, 3};` 静态初始化数组，调用 `arrayToString(arr)` 接收返回值并输出，最终输出 `[1, 2, 3]`。
- 拼接逻辑：先 `append("[")`，循环中最后一个元素只 `append(arr[i])`，其余元素 `append(arr[i]).append(", ")`（逗号加空格），最后 `append("]")`，再 `toString()` 转成 String 返回。
- 链式调用成立是因为 `append` 返回的仍是同一个 StringBuilder 对象，所以 `append(arr[i]).append(", ")` 是在同一对象上连续追加。
- 用 StringBuilder 而不是循环里 `+` 拼接：`+` 每次都会产生新 String 对象，循环拼接用 StringBuilder 效率更高，这是本题的考点意图。

## 笔试易错点
- 边界条件是关键：判断用 `i == arr.length - 1` 识别最后一个元素，否则末尾会多出一个 `", "`，变成 `[1, 2, 3, ]`；笔试填空/改错常在这里设坑。
- `append` 的参数可以是 int：`append(arr[i])` 会先把整数转成字符串再追加，不用自己先 `String.valueOf`。
- 空数组的边界：按本写法空数组输出 `[]`，循环一次都不执行，`[` 和 `]` 直接拼在一起——复习时可顺带想一下这个边界结果。
- 首行注释 `SringBuilder` 是拼写错误，少了个 `t`，正确是 `StringBuilder`；照抄进代码会找不到类、编译报错。
- 文件名 Demo12 没有含义：判断练什么只看代码内容，本题练的是「数组转格式字符串」，不要凭文件名脑补其他知识点。
