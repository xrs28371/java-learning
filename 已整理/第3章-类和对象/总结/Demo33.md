# Demo33 总结

## 练的知识点
- 数组**遍历**：静态初始化 `int arr[] = {11, 22, 33, 44, 55}`，用 `for (int i = 0; i < arr.length; i++)` 逐个取出 `arr[i]` 并打印。

## 关键结论
- 遍历的通用骨架：下标从 0 到 `arr.length - 1`，循环条件写 `i < arr.length`，换任何数组都不用改数字。
- 本例把元素先存进 `ret` 再打印，效果与直接 `System.out.println(arr[i])` 相同。

## 笔试易错点
- 条件写成 `i <= arr.length` 会多走一次并越界报错。
- `arr.length` 是属性、没有括号；字符串取长度才是 `length()` 方法，别混。
