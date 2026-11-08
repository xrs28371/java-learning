# OuterDemo1.java 总结

- 内容：配合 `Outer1.java` 的测试主类。`main` 方法只有两行：创建 `Outer1` 对象，调用 `o.method()`，通过外部类方法间接调用其 `private` 成员内部类 `Inner` 的 `show()`，最终打印外部类成员 `num` 的值 10。
- 知识点：`private` 成员内部类不能在外部直接 `new`，标准用法就是这样——外部类提供一个 `public` 方法，在方法内部创建内部类对象并调用，外部其他类只跟这个方法打交道；这是成员内部类最常见的实际用法，把内部类当作外部类的实现细节藏起来。
- 易错点：别把这个文件和 `InnerDemo.java` 搞混——两者都是测 `Outer1` 的主类，`OuterDemo1` 是已写好的可运行版（直接调 `method()`），`InnerDemo` 里还留着被注释掉的错误示范 `new Outer1().new Inner()`；笔试若问“怎么访问 private 内部类”，答案是“调外部类提供的 public 方法”，不是“直接 new 内部类”。

