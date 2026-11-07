# Dog4.java 总结

- 内容：`Dog4 extends Animal7 implements Jumpping1`，与 Cat8 对仗的另一组实现：重写抽象方法 `eat()`（打印 `Dog4 is eating`）、实现接口方法 `jump()`（打印 `Dog4 is jumping`），另有无参构造和 `Dog4(String name, int age)` 有参构造（内部 `super(name, age)`）。
- 知识点：同一个抽象父类 + 同一个接口可以派生出多个子类，Cat8 和 Dog4 各自实现 eat/jump 时输出不同，这就是多态的基础——父类/接口引用指向不同子类对象时，调同一个方法会跑不同的实现；继承 + 实现的组合是 Java 里“is-a（是一种动物）+ has-ability（会跳）”的典型建模方式。
- 易错点：接口名 `Jumpping1` 是错拼（正确为 Jumping，一个 p），引用时必须照抄；`public  Dog4(){` 里 `public` 和类名之间有两个空格、属于排版问题不影响编译，但笔试手写时别照抄这种多余空格；子类构造方法里 `super(name, age)` 必须写在第一行，写在别的语句后面会编译报错。
