# Animal6.java 总结

- 内容：抽象类 `public abstract class Animal6`，标准“抽象类 + 封装”模板。私有成员变量 `name`、`age`；无参构造和全参构造 `public Animal6(String name, int age)`（用 `this.name = name` 赋值）；`name`、`age` 各一套 get/set 方法；一个抽象方法 `public abstract void eat();`。
- 知识点：抽象类与封装的结合。① 抽象类同样可以有私有成员变量和完整的 get/set，封装规则不变；② 全参构造让子类能通过 `super(name, age)` 一次性把父类数据初始化好（见 Cat6、Dog2）；③ 抽象方法 `eat()` 限定所有子类必须实现自己的吃法，Cat6 吃鱼、Dog2 吃狗粮，各写各的。④ 父类只定“必须吃什么动作”和“数据怎么存”，具体吃什么由子类定，这是抽象类最常见的用法。
- 易错点：笔试高频点——抽象类不能实例化，`new Animal6()` 编译报错；但它的构造方法照常存在、由子类 `super(...)` 调用；get/set 里 `this.name = name` 的 this 不能省（参数名和成员变量同名，不加 this 就是自己给自己赋值）；抽象方法只有声明没有方法体，写 `{}` 空方法体是错的。
