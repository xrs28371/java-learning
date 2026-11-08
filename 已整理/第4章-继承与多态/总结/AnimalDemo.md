# AnimalDemo.java 总结

- 内容：多态的两种经典用法（本轮改写，旧版 main 里验证 `a.age` 的写法已删除）。`useAnimal(Animal a)`：形参是父类类型，实参传子类对象 `Cat1`，方法内 `a.eat()` 执行的是子类重写版——多态作方法参数；`getAnimal()`：返回类型写父类 `Animal`，实际返回 `new Cat1()`——多态作方法返回值。
- 知识点：多态的三种使用形式——父类引用指向子类对象（`Animal a = new Cat1();`）、父类类型作方法形参、父类类型作方法返回值，本文件一次练了后两种。核心都是「编译看左、运行看右」：`a.eat()` 编译时看父类有没有 eat，运行时执行子类 Cat1 的版本，输出 "cat1"。
- 易错点：`useAnimal` 的注释 `//Animal a=new Cat();` 是示意写法，实际传参是 `Cat1` 对象（见 AnimalOperator.java 的调用），笔试别把注释里的 Cat 当成真实类型；`getAnimal()` 返回的 `Animal a` 表面是父类引用，实际指向 Cat1 对象，`a.eat()` 输出 "cat1" 而不是父类的内容——父类 Animal 现在是抽象类，根本没有自己的 eat 实现。

- 备注（版本变化）：2026-11-08 本轮改写，旧版已另存为历史版本/AnimalDemo-旧版-20261108-0849.java；旧总结里「成员变量无多态（a.age 输出 40）」的验证已失效，因为新版 Animal 已无 age 变量。
