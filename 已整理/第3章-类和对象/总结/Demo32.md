# Demo32 总结

## 练的知识点
- 数组的两个常见异常，故意触发看报错：
  - **索引越界**：`int arr[] = new int[3]` 后访问 `arr[3]`，抛 `ArrayIndexOutOfBoundsException`（长度 3 的合法下标只有 0、1、2）。
  - **空指针**：`arr = null` 后再访问 `arr[0]`，抛 `NullPointerException`；`null` 表示变量不指向任何数组对象。

## 关键结论
- 下标范围是 `0 ~ length-1`，`arr[arr.length]` 必越界。
- 数组变量赋 `null` 后，取长度、取元素、遍历都会空指针。

## 笔试易错点
- 这份代码一次运行只能看到第一个异常：`arr[3]` 先抛异常程序就终止，空指针那段执行不到；要分别注释掉一段才能各看一次，别以为运行一遍能出两个报错。
- 异常名要写准：`ArrayIndexOutOfBoundsException` 与 `NullPointerException`。
