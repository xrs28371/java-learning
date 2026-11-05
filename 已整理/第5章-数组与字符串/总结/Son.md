# Son 总结

## 练的知识点
- 单继承 vs 多继承：`Son extends Father`，注释明确写出 `public class Son extends Father, Mother` 不能继承多类——Java 的类只支持单继承，不支持多继承。
- 多层继承：Java 支持多层继承，Son → Father → Granddad 是一条三层链，Son 能用爷爷 `drink()` 和爸爸 `smoke()` 两个方法。

## 关键结论
- 注释就是这份代码的全部内容：没有新方法，练的是继承规则本身。
- 单继承（一个类只有一个直接父类）和多层继承（可以一层层往上继承）不矛盾：Son 的直接父类只有一个 Father，但通过 Father 间接继承了 Granddad。
- `Mother` 之所以单独成类、没被 Son 继承，就是为了反衬这条规则：Son 拿不到 `dance()`。

## 笔试易错点
- 高频考点：Java 类是单继承、多层继承；接口才是多实现（`implements A, B` 可以写多个）。
- `extends Father, Mother` 这种写法编译报错，笔试选择题常拿它当干扰项。
- 注意区分"多继承"和"多层继承"两个词：多继承指一个类同时有多个直接父类（Java 不允许），多层继承指 A→B→C 链式继承（Java 允许）。
- 注意：本文件内容属第 4 章继承，但按章节路由表归入第 5 章文件夹，复习时按知识点找、不要只按文件夹认章节。
