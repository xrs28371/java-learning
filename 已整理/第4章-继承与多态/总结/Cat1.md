# Cat1.java 总结

- 内容：`Cat1 extends Animal`，用 `@Override` 重写 `eat()`，输出「猫吃鱼」。与 Cat.java 是同一练习的第二遍（文件名带 "1" 的版本），但更精简：没有定义自己的 `age`、`weight` 和 `palyGame()`。
- 知识点：重写只要求方法名、参数列表、返回类型与父类一致；子类可以只重写方法、不加任何新成员。`@Override` 同样是编译期校验，签名写错会直接报错。
- 易错点：注意继承关系——Cat1 的父类是 `Animal`，不是同批新建的 `Animal1`（Animal1 是个空类）；判断继承关系只看 `extends` 后面的名字，别被 "1" 的编号带偏。和 Cat.java 对比着看：Cat 有变量隐藏（age=20），Cat1 没有，所以父类引用指向 Cat1 对象时访问 age 一定是父类的 40，不存在歧义。
