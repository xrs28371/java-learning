# Mother 总结

## 练的知识点
- 独立的类：`Mother` 不继承任何类，只定义了一个 `dance()` 方法，输出"妈妈爱跳舞"。
- 它的作用是做对比：配合 `Son.java` 里的注释，说明 Java 类不能同时继承两个父类。

## 关键结论
- `Mother` 与 Granddad/Father/Son 不在同一条继承链上，是一个平行独立的类。
- 虽然 Son 在现实中既有爸爸又有妈妈，但代码里 `Son` 只能 `extends Father`，不能再 `extends Mother`——`Mother` 的 `dance()` 方法 Son 拿不到。
- 想让 Son 同时有爸爸和妈妈的行为，要用接口（`implements`）或组合，而不是多继承。

## 笔试易错点
- Java 类只支持单继承：`class Son extends Father, Mother` 是错误写法，编译不通过，笔试常考。
- 不要把"现实里有两个来源"直接套到代码里：Java 的单继承是语言硬性规定，与现实直觉不同。
- 注意：本文件内容属第 4 章继承，但按章节路由表归入第 5 章文件夹，复习时按知识点找、不要只按文件夹认章节。
