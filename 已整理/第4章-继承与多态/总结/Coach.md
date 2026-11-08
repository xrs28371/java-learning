# Coach.java 总结

- 内容：抽象子类，继承 Person，新增抽象方法 `teach()`，同样没有实现父类的 `eat()`。
- 知识点：与 Player 同构——抽象类分叉出两条线（运动员线 study、教练线 teach），共用 Person 的 name/age 和 eat 义务；这是「抽象类做模板、子类分工」的典型结构。
- 易错点：继承抽象类时，要实现的是整条链上积累的全部抽象方法，不只是直接父类新增的那个（Coach 的具体子类要同时实现 teach 和 eat）。
