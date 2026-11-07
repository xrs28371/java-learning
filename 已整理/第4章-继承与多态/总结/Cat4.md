# Cat4.java 总结

- 内容：`public class Cat4 extends Animal4`，继承抽象类 Animal4，用 `@Override` 重写抽象方法 `eat()`，方法体输出 "cat eat fish"。
- 知识点：抽象类的子类实现。Cat4 不是抽象类，所以必须实现父类 Animal4 的全部抽象方法（这里只有 `eat()`）；实现后 Cat4 就是普通类，可以 `new Cat4()`，并且能被 `Animal4` 类型的父类引用指向（多态），见 AnimalDemo4。`@Override` 注解表示这是重写，方法名、参数、返回值必须和父类抽象方法一致。
- 易错点：笔试高频点——普通子类不重写抽象方法就编译报错（要么重写、要么自己也加 abstract）；重写时访问权限不能比父类更小（父类 `eat()` 是 public，子类也必须是 public，不能写成默认或 private）；`@Override` 写错方法名或参数时编译器会报错，写对了是帮你防错的工具，别把它当装饰。
