# Demo39 总结

## 练的知识点
- **带返回值的方法的定义与调用（boolean 返回值）**：定义 `isEvenNumber(int number)`，用 `number % 2 == 0` 判断偶数，偶数 `return true`，否则 `return false`。
- 带返回值方法的标准用法：`boolean flag = isEvenNumber(10);` 把返回值存进变量再 `System.out.println(flag)`，输出 `true`。

## 关键结论
- 有返回值的方法，返回值是它“交出来的结果”，调用方要接住才有用：赋值给变量是最常用的接法，后续可以继续判断、打印或参与运算。
- `return` 一执行方法立即结束：`if` 分支里 `return true` 后就不会再走到 `else`，所以这里 `if-else` 两个分支各一个 `return`，恰好覆盖了所有情况。

## 笔试易错点
- 接收返回值的变量类型必须与返回值类型一致：这里返回 `boolean`，就得用 `boolean flag` 接，用 `int` 接会编译报错。
- 代码注释里写法的辨析：`isEvenNumber(10);` 单独写成一条语句在 Java 里是合法的（方法调用本身可作语句），只是返回值被丢弃、白算了；但光写一个 `true;` 是不合法的语句，笔试填空/改错见到要能区分。
- 形参名 `number` 和方法名 `isEvenNumber` 别拼错；`%` 是取余不是除法，`number % 2 == 0` 才是偶数判断，写成 `number / 2 == 0` 就全错了。
