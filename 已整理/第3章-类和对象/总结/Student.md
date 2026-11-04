# Student.java 总结（2026-11-04 16:03 同步更新版）

## 这份代码在练什么
独立的 Student 类，主练 **this 关键字 + 构造方法**，顺带把封装补齐：name 和 age 都是 private，配 get/set 和 show()。本轮新增的是构造方法一节：无参构造 + 带参构造（构造方法重载）。

## 关键内容
- `setName(String name)` 里写 `this.name = name;`：形参和成员变量同名时，`this.name` 指成员变量，不带 this 的 `name` 指形参。代码内注释总结到位：「this 就是解决局部变量隐藏成员变量」。
- `setAge(int age)` 同样用 `this.age = age;`；配了 `getName()`（返回 String）和 `show()`（打印 Name/Age）。
- 构造方法（本轮新增）：
  - `public Student(){}`：无参构造，创建对象时做初始化。
  - `public Student(String name, int age)`：带参构造，内部用 `this.name = name; this.age = age;` 一次性赋值。
  - 两者同名、参数不同，属于构造方法重载；注释口诀是「先写无参，再自定义带参的」。
  - 注释还点明：如果自己没写任何构造方法，系统会给一个默认无参构造；一旦自己写了带参构造，系统就不再自动给无参构造——所以无参构造要自己补写，否则 `new Student()` 会编译报错。
- 封装注释：面向对象三大特征之一（封装、继承、多态）；封装原则是把信息隐藏在类内部、不允许外部直接访问，字段 private + 对外 get/set；好处是提高安全性、提高复用性。

## 与 StudentDemo.java 里那版的区别（重要）
- StudentDemo.java 内的类：setAge 带 0–100 校验（超限打印 Invalid Age 不赋值），且配了 getAge()。
- 本文件这版：setAge **没有校验**，且**没有 getAge()**（只有 getName）。
- 笔试写封装题的标准答案形态是「private 字段 + 带校验的 set + 每个字段对应的 get」，以 StudentDemo.java 那版为准；本文件是 this + 构造方法专题版，别把两版的细节记混。

## 笔试易错点
1. 形参和成员变量同名时漏写 this → 变成形参给自己赋值，成员变量没变，编译还不报错、最难查。
2. get 方法返回类型必须与字段类型一致（getName 返回 String，getAge 返回 int）。
3. set 方法一般无返回值（void），靠参数传入新值。
4. 构造方法没有返回值类型（连 void 都不写），且方法名必须与类名完全一致；只写了带参构造又用 `new Student()` 时会报错，因为系统不再补默认构造。
5. 构造方法重载靠参数列表区分（个数/类型不同），不能只靠返回值区分。
