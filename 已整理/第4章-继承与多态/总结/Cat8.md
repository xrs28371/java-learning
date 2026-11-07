# Cat8.java 总结

- 内容：`Cat8 extends Animal7 implements Jumpping1`，同时继承抽象父类 Animal7 并实现接口 Jumpping1：重写抽象方法 `eat()`（打印 `cat8`）、实现接口方法 `jump()`（打印 `cat88`），另有无参构造和 `Cat8(String name, int age)` 有参构造（内部 `super(name, age)`）。
- 知识点：一个类可以在继承一个类的同时实现多个接口，写法是 `class X extends 父类 implements 接口1, 接口2`；继承来的抽象方法（eat）和接口里的抽象方法（jump）都必须重写，否则 Cat8 自己也得是抽象类；有参构造用 `super(name, age)` 把 name、age 交给父类构造方法初始化，`super(...)` 必须是构造方法里的第一行。
- 易错点：`eat()` 输出是 `cat8`、`jump()` 输出是 `cat88`，两个字符串只差一个 8，笔试看输出时别看串；`implements` 后面接口名要照抄错拼 `Jumpping1`（正确拼写是 Jumping，一个 p），写成 Jumping 会找不到类；无参构造里什么都没写是合法的，但父类 Animal7 必须有无参构造，否则无参构造里要显式写 `super(...)` 才会编译通过。
