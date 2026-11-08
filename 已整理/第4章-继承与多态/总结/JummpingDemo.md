# JummpingDemo.java 总结

- 内容：接口的工具类（2026-11-08 新建）。两个方法：① `useJumpping(Jumpping j)`，形参是接口类型，方法体内调 `j.jump();`；② `getJumpping()`，返回值是接口类型，方法体内 `Jumpping j = new Cat2(); return j;`。本文件没有 main 方法，不是测试类，要配合 `JumppingOperator.java` 使用。
- 知识点：接口多态作参数＋作返回值。① 形参是接口名，实际传进来的是实现类对象（这里是 `Cat2`），调的是实现类重写的 `jump()`；② 返回值是接口名，实际返回的也是实现类对象，调用方拿到 `Jumpping` 引用再调 `jump()`，执行的还是 `Cat2` 的版本；③ 这是「面向接口编程」：`useJumpping` / `getJumpping` 的代码里一个 `Cat2` 都没出现（`getJumpping` 体内除外），将来换成别的实现类（比如 `Dog implements Jumpping`），这两个方法的签名不用改。
- 易错点：**文件名拼写与接口名拼写不一样**：本文件是 `JummpingDemo`（两个 m、一个 p），接口是 `Jumpping`（一个 m、两个 p），是两个不同的拼写错误，写代码时必须按各自的错法原样照抄，混用会找不到符号；同目录下还有一个旧文件 `JumppingDemo.java`（一个 m，里面用的是 `Cat7`），和本文件不是同一个文件，别混淆。`getJumpping()` 里 `return j;` 返回的是接口引用，调用方只能调接口里声明的方法，实现类自己加的方法调不到。
