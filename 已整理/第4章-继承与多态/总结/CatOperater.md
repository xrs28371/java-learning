# CatOperater.java 总结

- 内容：猫操作类，只提供一个方法 `useCat(Cat c)`，形参是 `Cat` 类型，方法体只有一句 `c.eat()`——拿到传进来的猫对象就调用它的吃方法。
- 知识点：这是「类作为形式参数」的标准写法——形参写某个类，实参就必须传该类的对象；方法内部直接用形参对象调方法，不用再 new。这个套路和 AnimalOperater.java（形参写父类 Animal、靠多态）是同一节的两种形态：CatOperater 只接 Cat，AnimalOperater 接一切 Animal 子类，后者扩展性更好。
- 易错点：**类名拼写错误**：`CatOperater` 应为 `CatOperator`（operator 错写成 operater），和之前 AnimalOperater.java 是同一个课件拼写错误；类名一旦定错，`new CatOperater()` 和引用处都得跟着错，笔试写类名时先默念一遍拼写。形参类型写错（如写成 `Animal`）会导致传 `Cat` 之外的对象也能进，语义就变了；方法体里 `c.eat()` 的 `c` 是形参名，别写成类名 `Cat.eat()`（eat 不是静态方法）。
