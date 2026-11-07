# Interlmpl.java 总结

- 内容：接口 `Inter` 的实现类：`public class Interlmpl implements Inter`，用 `@Override` 重写了接口里的两个抽象方法 `method()` 和 `show()`，两个方法目前都只是打印一行 `Interlmpl`；注释里写了它等价的完整写法 `public class InterImpl extends Object implements Inter`。
- 知识点：实现接口用 `implements` 关键字；实现类必须重写接口里的全部抽象方法，否则实现类本身要声明为抽象类；一个没有显式父类的类默认继承 `Object`，所以注释里 `extends Object implements Inter` 的写法是对的，只是 `extends Object` 平时都省略不写；`@Override` 是校验注解，重写方法时写上它，方法签名写错编译器会立刻报错。
- 易错点：类名 `Interlmpl` 里是小写字母 l（`lmpl`），不是大写 I（`Impl`）——`InterImpl` 才是常规拼写，`Interlmpl` 容易看错、打错，引用时必须照抄文件名，IDE 自动补全也要核对；两个方法体目前都只打印类名，实际做题/做项目时要按业务逻辑改，别直接照抄这个空壳。
