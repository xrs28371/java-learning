# StudentDemo 总结

## 练的知识点
- 类的定义（第3章-类和对象）：用 `public class StudentDemo` 定义一个学生类，类名与文件名 StudentDemo.java 一致。
- 成员变量的定义：类体里直接写 `String name;` 和 `int age;`，分别表示学生的姓名和年龄。
- 成员方法的定义：`study()` 和 `doHomework()` 两个无参无返回值方法，方法体各用 `System.out.println` 打印一句提示，写法上一个是 `public void study(){...}` 紧凑式、一个是把 `{` 换行的松散式，两种格式都合法。

## 关键结论
- 这份代码只负责「定义学生类」，本身没有 main 方法，不能直接运行；它要等 StudentDemo1 这样的测试类创建对象后才会被用到。
- 成员变量和方法都写在类体里、方法体外：name、age 是类的成员，不是某个方法的局部变量；study、doHomework 是类的方法，调用时必须通过对象（如 `s.study()`）。
- 当前两个方法的返回值都是 void、都没有参数，调用时只会打印固定的一句话，不接收、不返回任何数据。

## 笔试易错点
- 没有 main 方法就无法独立运行：考试若问「运行结果」，先确认有没有 main——StudentDemo 单独拿出来是跑不出输出的，必须配上带 main 的测试类。
- 成员变量与局部变量要分清：name、age 写在类体里才叫成员变量、才有默认值；若误写进方法体里就成了局部变量，未赋值使用会编译报错。
- 方法定义的完整形态：`public void study()` 中 public（访问修饰符）、void（无返回值）、方法名、空括号缺一不可；漏写 void 或括号都会编译报错。
- 类名与文件名必须一致：StudentDemo 类在 StudentDemo.java 文件中，一个文件中只能有一个 public 类，考试手写代码时先对齐文件名。
- 注意与同章旧文件区分：这里的 StudentDemo 与之前已有的 Student.java 是两个不同的类，不要混淆——StudentDemo 自带 name、age 和两个方法，是目前可直接拿来创建对象的完整学生类。
