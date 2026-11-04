# StudentDemo1.java 总结（2026-11-04 下午更新版，untitled1 项目）

## 这份代码在练什么
this 版 Student 类的测试类：创建对象 → 用 set 方法赋值 → 调 show() 输出，验证 this 版 Student 能跑通。注意：这版依赖的是同项目的独立 Student 类（不是 StudentDemo 类），与旧版总结描述的对象不同。

## 运行流程与结果
- `Student s = new Student();`
- `s.setName("xrsxrs");`、`s.setAge(23);`
- `s.show();` 输出：
  - `Name : xrsxrs`
  - `Age : 23`

## 还差的一步
- Student 里定义了 `getName()`，但这个测试类里**没有调用**它（只调了 show）。笔试若要求用 get 取值，要写成 `System.out.println(s.getName());` 才算演示完整。
- 这版 Student 没有 getAge()，所以没法演示 getAge 调用；带校验 setAge＋getAge 的完整形态在 StudentDemo.java 里。
