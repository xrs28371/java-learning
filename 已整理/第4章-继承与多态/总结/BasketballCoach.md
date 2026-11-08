# BasketballCoach.java 总结

- 内容：具体类，继承 Coach，把继承链上积累的 `teach()` 和 `eat()` 全部实现，类不再是抽象类，可以 new。
- 知识点：具体子类必须实现从 Person、Coach 两层积累下来的全部抽象方法，漏一个类就得继续标 abstract、不能实例化。
- 易错点：输出字符串里 "how tu get score" 的 tu 是 to 的笔误——不影响编译运行，但对照预期输出判分时会丢分，字符串内容也要逐字检查。
