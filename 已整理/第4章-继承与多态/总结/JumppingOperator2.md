# JumppingOperator2.java 总结

- 内容：`method(Jumpping j)` 方法，参数是接口 `Jumpping` 类型，方法体只有一句 `j.jump();`——把“会跳”这个行为交给传进来的对象去执行，是 JumppingOperator.java 的同类变体（换了个类名、方法体相同）。
- 知识点：接口可以作方法的形参类型，这是多态最常见的用法之一：传 Cat8、Dog4 等任何实现了 `Jumpping` 的对象进来，`j.jump()` 都会按实际类型执行各自的跳法；调用方不需要知道具体是哪个类，只认接口。
- 易错点：参数类型写的是 `Jumpping`（Jumpping.java 里的接口），不是 `Jumpping1`——两个接口名字只差一个 `1`，别混用，传的对象必须实现的是 `Jumpping`；接口名 `Jumpping` 拼写有误（正确是 Jumping，多打了一个 p），引用时要照抄这个错拼；`j` 只能调接口里声明的 `jump()`，调不了实现类自己的其他方法。
