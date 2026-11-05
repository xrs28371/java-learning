# Teacher 总结

## 练的知识点
- 封装：`name`、`age` 两个字段全部 `private`，对外只暴露 `get/set` 方法。
- 有参构造方法：`Teacher(String name, int age)`，用 `this.name = name` 区分成员变量与形参。
- `display()` 方法：打印姓名和年龄。

## 关键结论
- 这是与 Student 配对的封装练习：两个类结构完全平行（私有字段＋有参构造＋getter/setter），为后续练继承（抽公共父类）或方法重写做准备。
- 类里只定义了有参构造，编译器不再自动提供无参构造——`new Teacher()` 会编译失败（见 Demo20 的坑）。

## 笔试易错点
- 一旦自己写了任何构造方法，默认无参构造就消失了；要想 `new Teacher()` 能用，必须显式再写一个无参构造。
- `this.name = name` 里 `this` 不能省：不写 `this` 就是形参给自己赋值，成员变量还是默认值（`null` / `0`）。
- getter/setter 的命名规范：`getName` / `setName` / `getAge` / `setAge`，笔试常考拼写。
- 注意：文件按章节路由表归入第 5 章文件夹，但实际练的是第 4 章封装/构造方法，复习时按知识点找、不要只按文件夹认章节。
