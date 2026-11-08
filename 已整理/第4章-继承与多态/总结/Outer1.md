# Outer1.java 总结

- 内容：`private` 成员内部类的写法。与 `Outer.java` 对照：同样是外部类 `Outer1` 含私有成员 `num = 10`，内部类 `Inner` 的 `show()` 打印 `num`，但这里内部类被声明为 `private class Inner`；文件里注释掉了一段 `public class Inner` 的旧版，旁边手写注释“一般用 private”。外部类同样提供 `method()` 方法，在内部创建 `Inner` 对象并调用 `show()`。
- 知识点：成员内部类用 `private` 修饰后，外部其他类无法直接创建其对象，只能通过外部类提供的方法间接访问——这是内部类最常见的实际用法（把内部类当作外部类的实现细节藏起来）；`private` 内部类内部仍然可以直接访问外部类的私有成员。
- 易错点：不要把 `Outer1` 和 `Outer` 混淆——两者同名方法、同名内部类，唯一区别就是内部类一个是 `public`、一个是 `private`；笔试若问“为什么一般用 private”，答案是封装：不让外界直接碰内部类，只留外部类方法做入口。注意类名 `Outer1` 末尾是数字 1，引用时别写成 `Outer`。
