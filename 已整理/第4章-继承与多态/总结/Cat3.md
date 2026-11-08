# Cat3.java 总结

- 内容（2026-11-08 更新后）：`Cat3` 现在实现接口 `Jumpping1`（不再是旧版的 Animal3 子类），重写 `jump()` 方法，输出 "Cat3"。注意：旧版内容（带参构造调 `super(name, age)`、重写 `eat()` 输出"猫吃鱼"）已被新内容替换，本总结已按新代码重写。
- 知识点：接口的实现（`implements`）+ 方法重写。类实现接口后必须重写接口里的全部抽象方法，否则类本身得声明为 abstract；`Jumpping1` 引用可以指向 `Cat3` 对象（`Jumpping1 jj = new Cat3();`），`jj.jump()` 按实际对象类型执行（多态/动态绑定）。
- 易错点：接口名 `Jumpping1` 拼写有误，正确是 `Jumping`（多打了一个 p），文件名和接口名必须完全一致，引用时要照抄这个错拼；`implements` 后多打了一个空格不影响编译，但注意 `implements` 关键字别写成 `extends`；接口引用只能调接口里声明的方法，`jj.jump()` 能调，`jj.eat()` 不能调（eat 不在接口里）。
