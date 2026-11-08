# JumppingOperator.java 总结

- 内容：接口多态的测试类（2026-11-08 新建），带 main 方法，分三步验证：① `Jumpping j = new Cat2(); j.jump();`——接口引用指向实现类对象，直接调 `jump()`，输出 "Jumping Cat2"；② `a.useJumpping(j);`——把接口引用传给形参是接口类型的方法，方法内再调 `jump()`；③ `Jumpping j2 = a.getJumpping(); j2.jump();`——接收返回值是接口类型的方法结果（实际还是 `Cat2` 对象），再调 `jump()`。末尾注释块点明规律：「方法的形参是接口名，其实需要的是该接口的实现类对象；方法的返回值是接口名，其实返回的是该接口的实现类对象」。
- 知识点：接口多态的完整调用链，与抽象类多态（AnimalOperator.java 那一套）一一对应，只是把“抽象类”换成了“接口”、把“子类”换成了“实现类”。编译看左边（接口里有没有 `jump()`）、运行看右边（执行 `Cat2` 重写的版本）。本文件与 `JummpingDemo.java`（工具类）、`Cat2.java`（实现类）、`Jumpping.java`（接口）是一套。
- 易错点：**文件名与接口名拼写不一样**：本文件是 `JumppingOperator`（两个 m、一个 p），接口是 `Jumpping`（一个 m、两个 p），是两个不同的拼写错误，必须按各自的错法原样照抄；接口本身不能 `new`，`new Jumpping()` 是错的，只能 new 实现类 `Cat2`；接口引用 `j` / `j2` 只能调接口里声明的方法，实现类自己加的方法调不到；`a` 是 `JummpingDemo` 的实例，`useJumpping` / `getJumpping` 是实例方法，不能用类名直接调。
