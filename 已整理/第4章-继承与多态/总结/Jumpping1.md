# Jumpping1.java 总结

- 内容：一个空接口骨架，只有 `public interface Jumpping1 {}` 一行，里面没有任何方法或常量；文件头带 `package PACKAGE_NAME;`，是 IDEA 新建文件时自动生成的默认包声明占位符。
- 知识点：接口的最小定义形式就是 `public interface 接口名 {}`，空接口本身也能编译通过；接口里的方法默认是 `public abstract`，常量默认是 `public static final`，即使不写修饰符也一样；接口不能实例化，只能由实现类 `implements` 它以后再 `new` 实现类。
- 易错点：接口名 `Jumpping1` 拼写有误，正确拼写是 `Jumping`（一个 p），`Jumpping` 是多打了一个 p——文件名和接口名必须完全一致，引用时要照抄这个错拼，改名要连文件带引用一起改；`package PACKAGE_NAME;` 是 IDEA 的占位包名，不是真实包，编译/运行时要改成实际包名或删掉，否则会报找不到包；空接口现在什么都干不了，下一步要往里面加抽象方法（比如 `void jump();`），再写实现类去实现它。
