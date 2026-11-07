# Animal3.java 总结

- 内容：多态练习的父类。私有成员变量 `name`（String）、`age`（int）；无参构造和带参构造 `Animal3(String name, int age)`；`getName/setName/getAge/setAge` 四个存取方法；`eat()` 方法输出"动物吃东西"。
- 知识点：封装（private 成员变量 + public 的 getter/setter）与构造方法重载。带参构造里用 `this.name = name` 区分成员变量和局部变量；子类 Cat3/Dog1 通过 `super(name, age)` 调用这个带参构造来给父类成员赋值。
- 易错点：笔试手写构造方法时注意——构造方法没有返回值类型，连 void 都不能写；`this.name = name` 里 this 不能省（否则是自己给自己赋值）；getter/setter 的方法名要和成员变量对应（getName 配 name、getAge 配 age），别写串。`eat()` 在这里是父类版本，子类重写后实际调用的是子类版本（动态绑定）。
