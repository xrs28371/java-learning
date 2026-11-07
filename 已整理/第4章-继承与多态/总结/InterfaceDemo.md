# InterfaceDemo.java 总结

- 内容：一个空的测试类骨架，只有 `public class InterfaceDemo { public static void main(String[] args) { } }`，main 方法里没有任何代码。刚建好，还没写测试逻辑，应该是准备用来测试接口（对应刚建的 Inter 接口）的主类。
- 知识点：测试类的标准写法就是带 `main` 方法的类，程序从 `main` 开始执行；接口的测试一般写成“接口多态”的形式，例如 `Inter i = new 某个实现类(); i.方法名();`，编译看左边、运行看右边；现在这个类是空的，运行后什么都不会输出。
- 易错点：光建了测试类还不够，必须先有接口里的方法和实现类（比如给 Inter 加抽象方法、再写一个 `implements Inter` 的类），这个 main 里才有东西可测；类名 `InterfaceDemo` 与 `Inter` 只是名字相近，没有任何语法上的关联，别以为改一个另一个会跟着变。
