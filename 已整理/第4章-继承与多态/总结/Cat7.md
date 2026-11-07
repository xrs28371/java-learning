# Cat7.java 总结

- 内容：`public class Cat7 implements Jumpping`，用 `implements` 实现 Jumpping 接口，重写抽象方法 `jump()`，输出 "Cat7 jump"。
- 知识点：接口的实现。① 一个类实现接口用 `implements`，必须实现接口里的**全部**抽象方法（除非这个类本身也是抽象类）；② 实现的方法必须加 `@Override`、签名与接口一致，且访问权限不能低于接口的 public；③ 实现接口的类对象可以赋给接口类型引用（见 JumppingDemo：`Jumpping j = new Cat7();`），调 `j.jump()` 走实现类的版本，这就是接口多态。
- 易错点：`implements` 别写成 `extends`——继承类用 extends，实现接口用 implements，两者关键字不同；接口名 `Jumpping` 是拼错的（正确是 Jumping），这里必须原样照抄错名，写对了反而编译不过；类名 Cat7 的编号别和前面 Cat、Cat1…Cat6 搞混；实现类如果漏写 `jump()` 且类没声明 abstract，编译直接报错。
