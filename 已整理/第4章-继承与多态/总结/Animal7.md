# Animal7.java 总结

- 内容：抽象类 `Animal7`，带 `private String name`、`private int age` 两个私有成员变量，提供无参构造和有参构造（`Animal7(String name, int age)`）、name/age 的 getter/setter，以及一个抽象方法 `public abstract void eat();`，是 Cat8、Dog4 的父类。
- 知识点：抽象类可以有成员变量、构造方法、普通方法（getter/setter）和抽象方法，抽象方法只有声明没有方法体，子类必须重写它；抽象类不能直接 `new`，只能被继承后由子类实例化；父类构造方法要靠子类用 `super(name, age)` 调用，子类有参构造里不写 `super(...)` 时默认调父类无参构造。
- 易错点：抽象方法 `eat()` 没有方法体，花括号都不能写，写成 `public abstract void eat() {}` 会编译报错；`name`、`age` 是 private 的，子类不能直接访问 `name`，必须走 `getName()`/`setName()`；子类继承抽象类后如果不重写全部抽象方法，子类自己也必须声明为 abstract，否则编译不通过。
