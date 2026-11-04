# StudentDemo1.java 总结（2026-11-04 16:03 同步更新版）

## 这份代码在练什么
this 版 + 构造方法版 Student 类的测试类，本轮新增了带参构造的调用：同一段 main 里先后演示「无参构造 + set 赋值」和「带参构造一步到位赋值」两种创建对象的方式，并都用 show() 验证。

## 运行流程与结果
1. `Student s = new Student();`（无参构造），先 `s.show();` 一次——此时 name 是 null、age 是 0，输出 `Name : null` / `Age : 0`。
2. `s.setName("xrsxrs");`、`s.setAge(23);`，再 `s.show();`，输出：
   - `Name : xrsxrs`
   - `Age : 23`
3. `Student s1 = new Student("xrs", 30);`（带参构造），`s1.show();`，输出：
   - `Name : xrs`
   - `Age : 30`

## 还差的一步
- Student 里定义了 `getName()`，但这个测试类里**没有调用**它（只调了 show）。笔试若要求用 get 取值，要写成 `System.out.println(s.getName());` 才算演示完整。
- 这版 Student 没有 getAge()，所以没法演示 getAge 调用；带校验 setAge＋getAge 的完整形态在 StudentDemo.java 里。

## 笔试易错点
1. 无参对象刚创建、还没 set 之前，String 字段默认 null、int 字段默认 0，show 出来就是 null/0，不是报错——别误以为对象没建成功。
2. 带参构造的参数顺序要与定义一致（先 name 后 age），写反了类型对不上会编译报错，类型相同写反了则静默错值。
3. 两个对象 s 和 s1 互不影响：改 s 的值不会动 s1，这是对象独立性的基本考点。
