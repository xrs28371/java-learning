# Demo21 总结

## 练的知识点
- 导包（import）的两种写法：`import java.util.Scanner;` 导入后直接写 `Scanner`，或每次都写全限定名 `java.util.Scanner`。
- 不同包下同名类的处理：注释里的 `cn.itcast.Teacher` 例子——用全限定名 `cn.itcast.Teacher t = new cn.itcast.Teacher();` 可以不用 import 就引用其他包的类。

## 关键结论
- 这份代码练的是“怎么用别的包里的类”：`import` 是一次导入、处处简写；全限定名是不导入、每次写全。两种写法效果一样，日常写代码用 import 更省事。
- 文件里真正生效的只有 `import java.util.Scanner;` 和 `Scanner sc = new Scanner(System.in);` 这两行；`cn.itcast.Teacher` 那段全在注释里，是笔记不是可运行代码。

## 笔试易错点
- **注释里的例子本身有错**：`t.teach();` 写在 `cn.itcast.Teacher t = new cn.itcast.Teacher();` 之前——先用后声明，即使取消注释也编译不过（找不到符号 t）。笔试若给类似代码，记住“先声明、后使用”。
- `Scanner sc` 创建后没有真正用过、也没有 `sc.close()`：编译能过，但属于未使用的变量，规范写法是用完要关闭（`sc.close()`），否则会报资源泄漏警告。
- `import` 语句的位置：必须写在 `package` 之后、类定义之前；`import java.util.Scanner;` 只能导入 `java.util` 下的 `Scanner`，不能顺带导入子包。
- 注意：文件按章节路由表归入第 5 章文件夹，但导包/包的概念实际属于第 4 章面向对象收尾部分，复习时按知识点找、不要只按文件夹认章节。
