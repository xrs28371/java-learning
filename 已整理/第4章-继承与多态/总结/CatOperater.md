# CatOperater.java 总结

- 内容：猫操作类，提供两个方法：`useCat(Cat c)`（形参是 `Cat` 类型，方法体只有一句 `c.eat()`——拿到传进来的猫对象就调用它的吃方法）和新增的 `getCat()`（无参，方法体内 `new Cat()` 再 `return c`，返回一个 Cat 对象）。
- 知识点：「类作为形式参数」+「类作为返回值」两个套路合在一类里——形参写某个类，实参就必须传该类的对象；返回值写某个类，方法返回的就是该类的对象。`getCat()` 里 `Cat c = new Cat(); return c;` 是标准写法：先在方法内创建对象，再把引用返回给调用者。这个套路和 AnimalOperater.java（形参写父类 Animal、靠多态）是同一节的两种形态：CatOperater 只接 Cat，AnimalOperater 接一切 Animal 子类，后者扩展性更好。
- 易错点：**类名拼写错误**：`CatOperater` 应为 `CatOperator`（operator 错写成 operater），和之前 AnimalOperater.java 是同一个课件拼写错误；类名一旦定错，`new CatOperater()` 和引用处都得跟着错，笔试写类名时先默念一遍拼写。`getCat()` 的返回值类型必须写 `Cat` 而不是 `void`；`return c;` 返回的是对象的引用，调用者拿到的是同一个对象；方法体里 `c.eat()` 的 `c` 是形参名，别写成类名 `Cat.eat()`（eat 不是静态方法）。
