# Inter.java 总结

- 内容：接口 `Inter` 的完整定义：两个常量 `num = 10`、`num2 = 20`（`num2` 显式写了 `final`），两个抽象方法 `method()`（显式 `public abstract`）和 `show()`（没写修饰符、默认抽象）；注释里特意写了两条“不能有”——接口不能有构造方法、不能有非抽象方法（`public void show(){}` 被注释掉）。
- 知识点：接口的成员特点——成员变量只能是常量，默认修饰符 `public static final`（所以 `num` 没写 `final` 也是常量）；接口没有构造方法，因为接口只是对行为的抽象、没有具体存在；成员方法只能是抽象方法，默认修饰符 `public abstract`，`void show();` 不写修饰符也是抽象方法。
- 易错点：接口里的变量写不写 `final` 都是常量，`i.num = 20` 这样赋值会编译报错（见 InterfaceDemo.java 的注释）；接口不能 `new`，也不能写构造方法；`method()` 和 `show()` 在实现类里必须全部重写，少一个实现类就得声明为抽象类。
