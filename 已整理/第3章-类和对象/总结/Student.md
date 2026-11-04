# Student.java 总结（2026-11-04 下午更新版，untitled1 项目）

## 这份代码在练什么
独立的 Student 类，主练 **this 关键字**，顺带把封装补齐：name 和 age 都已改 private（昨晚 name 还没 private，今天这份补上了）。旧版的空骨架套娃问题已不存在。

## 关键内容
- `setName(String name)` 里写 `this.name = name;`：形参和成员变量同名时，`this.name` 指成员变量，不带 this 的 `name` 指形参。用户自己的注释总结到位：「this 就是解决局部变量隐藏成员变量」。
- `setAge(int age)` 同样用 `this.age = age;`。
- 配了 `getName()`（返回 String）和 `show()`（打印 Name/Age）。
- 注释口诀：set 改变变量、get 获取变量。

## 与 StudentDemo.java 里那版的区别（重要）
- StudentDemo.java 内的类：setAge 带 0–100 校验（超限打印 Invalid Age 不赋值），且配了 getAge()。
- 本文件这版：setAge **没有校验**，且**没有 getAge()**（只有 getName）。
- 笔试写封装题的标准答案形态是「private 字段 + 带校验的 set + 每个字段对应的 get」，以 StudentDemo.java 那版为准；本文件是 this 专题版，别把两版的细节记混。

## 笔试易错点
1. 形参和成员变量同名时漏写 this → 变成形参给自己赋值，成员变量没变，编译还不报错、最难查。
2. get 方法返回类型必须与字段类型一致（getName 返回 String，getAge 返回 int）。
3. set 方法一般无返回值（void），靠参数传入新值。
