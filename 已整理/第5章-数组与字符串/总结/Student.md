# Student 总结

## 练的知识点
- 封装：`name`、`age` 两个字段全部 `private`，对外只暴露 `get/set` 方法。
- 有参构造方法：`Student(String name, int age)`，用 `this.name = name` 区分成员变量与形参。
- `study()` 方法：打印“好好学习，天天向上”。

## 关键结论
- 这是与 Teacher 配对的封装练习：两个类结构完全平行（私有字段＋有参构造＋getter/setter），为后续练继承（抽公共父类）或方法重写做准备。
- 与 Teacher 的区别：Student 多了一个 `study()` 行为方法，Teacher 对应的是 `display()`——两个子类各自的行为不同，这正是后续抽父类时“共性上移、特性下留”的素材。

## 笔试易错点
- 一旦自己写了任何构造方法，默认无参构造就消失了；要想 `new Student()` 能用，必须显式再写一个无参构造。
- `this.name = name` 里 `this` 不能省：不写 `this` 就是形参给自己赋值，成员变量还是默认值（`null` / `0`）。
- getter/setter 的命名规范：`getName` / `setName` / `getAge` / `setAge`，笔试常考拼写。
- 注意：文件按章节路由表归入第 5 章文件夹，但实际练的是第 4 章封装/构造方法，复习时按知识点找、不要只按文件夹认章节。
