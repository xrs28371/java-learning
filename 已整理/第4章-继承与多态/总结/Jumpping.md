# Jumpping.java 总结

- 内容：定义一个接口 `public interface Jumpping { void jump(); }`，里面只有一个抽象方法 `jump()`，没有任何成员变量和实现代码。本轮更新把方法声明由显式的 `public abstract void jump();` 简写成了 `void jump();`，含义完全相同。
- 知识点：接口的定义与抽象方法。① 接口用 `interface` 关键字定义，里面的方法默认就是 `public abstract`，写不写这两个修饰符效果一样，本轮更新正是从显式写法改成了省略写法；② 接口不能被实例化，只能被类 `implements` 实现；③ 接口是对“能力”的抽象——这里 `jump()` 表示“会跳”这个能力，至于谁会跳、怎么跳，由实现类自己定。
- 易错点：**接口名本身拼错了**——正确英文是 Jumping（一个 p），这里写成了 Jumpping（两个 p）。拼写错误不影响编译（只要所有引用处都用同一个错名），但笔试/面试写代码时如果顺手写成 Jumping 就会找不到符号、编译失败；实现类、测试类里必须原样照抄 `Jumpping`；另外接口里的方法默认 `public abstract`，实现时不能把访问权限缩小成默认或 private。**更要小心**：同目录下测试类的文件名是 `JummpingDemo` / `JumppingOperator`（两个 m、一个 p），和接口名 `Jumpping`（一个 m、两个 p）拼写不一样，是两个不同的错法，写代码时别把两处拼混了。
