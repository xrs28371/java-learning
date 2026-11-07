# Animal5.java 总结

- 内容：抽象类 `public abstract class Animal5`，成员：`private int age = 20`（普通成员变量）、`private final String name = "xrs"`（final 成员变量）；一个无参构造 `public Animal5() {}`；一个普通方法 `show()`：把 age 改成 40 并打印，打印 name；一个抽象方法 `public abstract void eat();`。`show()` 里有一行被注释掉的 `name = "cjh";`。
- 知识点：抽象类里的成员规则。① 抽象类可以有成员变量、构造方法、普通方法，不只是抽象方法；构造方法供子类创建对象时通过 `super()` 调用（子类对象创建时会先调父类构造）。② `final` 修饰的成员变量一旦赋值就不能再改：`name` 在声明时已赋值为 "xrs"，所以 `name = "cjh";` 是非法的，写出来编译报错——这行被注释掉正是这个原因。③ `private` 成员子类不能直接访问，只能通过父类自己的方法（如 `show()`）读写。
- 易错点：笔试高频点——final 变量只能赋值一次，声明时赋值或在构造方法里赋值二选一，之后再赋值就是编译错误；抽象类不能实例化，但**可以有构造方法**（不是给自己 new 用的，是给子类用的），别把“不能 new”和“没有构造”混为一谈；`age = 40` 在 `show()` 里合法，因为 age 只是普通变量；`final` 修饰的引用类型变量是引用不能改、对象内容可改，这里 name 是 String 本身不可变，别混淆。
