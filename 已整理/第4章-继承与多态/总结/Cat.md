# Cat.java 总结

- 内容：`Cat` 被改写为独立类（不再 `extends Animal`），只有一个方法 `eat()`，输出 "Cat eat fish"。这是「类作为形式参数」例题的被操作类，配合 CatOperater.java、CatDemo.java 一起用。
- 知识点：类可以作为方法的形参类型——形参写 `Cat`，实参传 `Cat` 对象，方法内部就能调用该对象的成员方法。这是「类作为形式参数」与「类作为返回值类型」一节的标准套路（见 CatOperater.java）。
- 易错点：**注意版本变化**：旧版 Cat 是 `extends Animal` 的子类，带同名变量 `age = 20`（变量隐藏）、`weight = 10` 和独有方法 `palyGame()`；本次同步后这些全被新版覆盖掉了。若旧例题（如 AnimalDemo.java、Cat8.java）还引用 `Cat.age` 或 `palyGame()`，会编译不过——这是同一文件名在不同例题里被复用的结果，复习时按当前版本为准，别把两版混在一起背。
