# Teacher 总结

## 练的知识点
- 封装：`name`、`age` 两个字段全部 `private`，对外只暴露 `get/set` 方法。
- 构造方法重载：同时写了无参构造 `Teacher()` 和有参构造 `Teacher(String name, int age)`，用 `this.name = name` 区分成员变量与形参。
- `display()` 方法：打印姓名和年龄。

## 关键结论
- 这是与 Student 配对的封装练习：两个类结构完全平行（私有字段＋两种构造＋getter/setter），为后续练继承（抽公共父类）或方法重写做准备。
- **本次更新补上了显式无参构造**：之前版本只写了有参构造，`new Teacher()` 编译不过（见 Demo20 旧版的坑）；现在无参＋有参两种创建方式都能用，Demo20 的 `new Teacher()` 已能正常编译。

## 笔试易错点
- 一旦自己写了任何构造方法，默认无参构造就消失了；要想 `new Teacher()` 能用，必须显式再写一个无参构造——这份代码就是标准示范。
- `this.name = name` 里 `this` 不能省：不写 `this` 就是形参给自己赋值，成员变量还是默认值（`null` / `0`）。
- getter/setter 的命名规范：`getName` / `setName` / `getAge` / `setAge`，笔试常考拼写。
- 注意：文件按章节路由表归入第 5 章文件夹，但实际练的是第 4 章封装/构造方法，复习时按知识点找、不要只按文件夹认章节。
