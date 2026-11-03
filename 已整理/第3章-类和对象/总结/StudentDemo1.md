# StudentDemo1 总结

## 练的知识点
- 对象的创建与使用（第3章-类和对象）：在 main 方法里用 `StudentDemo s = new StudentDemo();` 创建 StudentDemo 类的对象，再通过 `s.` 访问成员变量和成员方法。
- 成员变量的读写：先打印未赋值的 `s.name`、`s.age`，再赋值（`s.name = "xrs"`、`s.age = 10`）后重新打印，验证赋值生效。
- 成员方法的调用：`s.study()`、`s.doHomework()`，对象创建后必须显式调用方法才会执行方法体。
- （本次更新新增）调用访问成员变量的方法：末尾新增 `s.show();`，调用的是 StudentDemo 里新加的 show()——方法内部直接打印该对象的 name + age，验证「方法里读到的就是这个对象的成员变量」。
- （本次更新新增）通过 set 方法给私有成员赋值：`s.age = 10;` 被注释掉（原注释：直接赋值可能存在数据隐患），改为 `s.setAge(199);`——因为 StudentDemo 里 age 已改为 private，外部不能再直接写 age，只能走 public 的 setAge；且 199 超出 0–100 的合法范围，会被 setAge 拒收。

## 关键结论
- 运行顺序即代码顺序：创建对象 → 打印默认值 → 赋值 → 打印新值 → 调用 study → 调用 doHomework → 调用 show，最终输出依次为 `null0`、`xrs10`、`Study is called`、`Do Homework is called`、`xrs10`。
- （本次更新）当前版本完整运行输出：`s.setAge(199)` 先打印 `Invalid Age`（199 非法、age 未被改写仍为 0），随后 `s.study()` 打印 `Study is called`，`s.doHomework()` 打印 `Do Homework is called`，最后 `s.show()` 打印 `xrs0`（name 已赋值为 "xrs"，age 仍是默认值 0）。注意本轮开头那行打印默认值的语句已被注释掉，不再输出 `null0`。
- （本次更新）末尾的 `xrs10` 来自 `s.show()`：此时对象已赋值 name="xrs"、age=10，所以 show() 打印的是赋值后的拼接结果；若把 show() 移到赋值前调用，输出就会变成 `null0`——调用时机决定输出，方法本身不固定。
- 未赋值的成员变量有默认值：引用类型 `name` 默认 null，int 类型 `age` 默认 0，所以第一次打印的不是报错，而是 `null0`。
- `s.name + s.age` 是字符串拼接而非数值相加：因为 `s.name` 是 String，`+` 会把后面的 `age` 也转成字符串拼上去——赋值前是 "null" + "0" = `null0`，赋值后是 "xrs" + "10" = `xrs10`。

## 笔试易错点
- ⚠️ 高频易错：`System.out.println(s.name + s.age)` 输出的不是「姓名和年龄两个值」，而是拼成的一个字符串。第一次输出 `null0`（null 与 0 连在一起、中间无空格）、第二次输出 `xrs10`，不要误写成 `null 0`、`xrs 10` 或算成数值和。
- 成员变量默认值是高频考点：引用类型默认 null、int 默认 0；把「未赋值就打印」写成报错是错的，能编译能运行，只是输出默认值。
- 对象使用三步缺一不可：创建（`new StudentDemo()`）→ 赋值/调用；只创建不调用方法，方法体永远不会执行。
- `StudentDemo s = new StudentDemo();` 三段缺一不可：类型 `StudentDemo`、变量名 `s`、`new StudentDemo()`；漏 new 或漏括号都会编译报错。
- 类名与文件名必须一致：StudentDemo1 类在 StudentDemo1.java 文件中，一个文件中只能有一个 public 类，考试手写代码时先对齐文件名。
- 编译运行注意：StudentDemo1 依赖 StudentDemo 类，两个文件须放在同一目录（同一包）下一起编译，只拷一个文件会报「找不到符号 StudentDemo」。
- （本次更新新增易错）private 后直接写 `s.age = 10;` 不再是「数据隐患」的问题，而是直接编译报错：private 成员在别的类里不可见，考试若问这行代码的结果，答案是编译不通过、不是运行出非法值。
- （本次更新新增易错）`setAge(199)` 不会让程序崩溃：setAge 内部只是打印 `Invalid Age`、跳过赋值，程序继续执行后面的 study、doHomework、show；最终 show() 输出 `xrs0` 而不是 `xrs199`——被拒收的值不会悄悄写进去，age 保持 0。
- （本次更新新增易错）注释掉的代码不参与运行：本轮开头打印默认值的那行和 `s.age = 10;` 都已被 `//` 注释，运行输出里没有它们的位置，不要按旧版输出表照抄 `null0`。
