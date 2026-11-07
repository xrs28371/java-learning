# AnimalDemo5.java 总结

- 内容：一个空类，只有 `public class AnimalDemo5 {}`，没有任何成员变量和方法，连 `main` 方法都还没有。
- 知识点：空类本身可以正常编译，Java 允许没有任何成员的类存在。它通常是新建文件后还没开始写的占位。按命名规律（AnimalDemo4 是 Animal4 的演示类），这个类应该是为 Animal5（抽象类）准备的演示入口，后续会在里面写 `main` 方法，比如创建 Animal5 的子类对象并调用 `show()`、`eat()` 来验证抽象类成员变量、final 变量和多态。
- 易错点：现在这个类里没有 `main` 方法，运行它会报“找不到 main 方法”，不代表代码有错，只是还没写测试逻辑；笔试手写 main 方法注意签名必须一字不差：`public static void main(String[] args)`，少了 static、写错 String[] 都会导致“找不到 main 方法”。等后续往里面加代码时再补总结。
