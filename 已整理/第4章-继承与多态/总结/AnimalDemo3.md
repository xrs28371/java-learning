# AnimalDemo3.java 总结

- 内容：测试类（main 方法），练「多态 + 父类构造方法传参」。先 `Animal3 a = new Cat3();`（向上转型），用 setter 设名"xrs"、年龄 100，打印 `a.getName() + a.getAge()` 得到 "xrs100"，调 `a.eat()` 输出"猫吃鱼"；再 `a = new Cat3("xrs", 1000);`（带参构造 + super 传参），调 `eat()`，打印 "xrs1000"。
- 知识点：向上转型后调 `eat()` 走的是子类重写版本（动态绑定）；`super(name, age)` 让子类对象创建时就把父类成员变量赋值好，不用再逐个调 setter；`getName() + getAge()` 是字符串与 int 相加，结果是拼接不是算术加法。
- 易错点：`a.getName() + a.getAge()` 输出 "xrs100" 而不是 100+xrs 的数值计算，笔试看输出题时先看拼接规则；第二次赋值 `a = new Cat3("xrs", 1000)` 是新建对象替换引用，旧对象被丢弃；`a` 是 Animal3 类型引用，只能调父类有的方法，调不到 Cat3 特有方法，想调必须向下转型。
