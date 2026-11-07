# Dog2.java 总结

- 内容：`public class Dog2 extends Animal6`，继承抽象类 Animal6，和 Cat6 是“兄弟类”。重写抽象方法 `eat()`，输出 "dog eat"；两个构造方法：带参 `public Dog2(String name, int age)`（用 `super(name, age);` 交给父类初始化）和无参 `public Dog2() {}`。
- 知识点：同一抽象父类的多个子类。① Animal6 的抽象方法 `eat()` 由每个子类各自实现，Cat6 是 "eat fish"，Dog2 是 "dog eat"，这就是抽象类“定动作、子类定实现”的典型用法；② 子类构造同样用 `super(name, age)` 把父类数据初始化；③ 父类引用指向不同子类对象时，调 `eat()` 会执行各自的版本（多态），AnimalDemo6 里只演示了 Cat6，Dog2 同理可测。
- 易错点：`super(name, age)` 必须是构造方法第一行；子类构造不写 `super(...)` 时默认调父类无参构造，父类必须有无参构造（Animal6 有）；重写方法签名必须与父类抽象方法一致，访问权限不能缩小；注意类名 Dog2、父类 Animal6，别和前面 Dog、Animal 系列搞混编号。
