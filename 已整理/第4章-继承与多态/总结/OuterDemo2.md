# OuterDemo2.java 总结

- 内容：测试类，`main` 方法里 `new Outer3()` 并调用 `o.method()`，用来跑 Outer3.java 里写的匿名内部类三种写法。
- 知识点：匿名内部类本身没有名字、不能单独 `new`，要通过宿主类（如 Outer3）的普通方法把它包起来，再由测试类的 `main` 去调宿主类的方法才能执行到；这是这组练习的标准分工——Outer3 写逻辑、OuterDemo2 当入口。
- 易错点：`OuterDemo2` 里只调了 `method()`，如果 Outer3 的方法名改了，这边也要同步改；测试类本身没有业务逻辑，别把它当知识点文件背。
