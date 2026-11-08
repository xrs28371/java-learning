# PersonDemo.java 总结

- 内容：测试类。无参构造创建 TennisPlayer 和 BasketBallPlayer，用 set 赋值 name/age，get 输出，再依次调 eat()、study()，网球运动员多调一个 speak()。
- 知识点：完整走通「抽象类分层＋接口按需实现」的调用链；用无参构造＋set 赋值（也可以用全参构造一行搞定，两种写法都要会）。
- 易错点：`System.out.println(p.getName()+p.getAge())` 是字符串拼接，输出是 "xrs18" 连在一起、没有分隔；BasketBallPlayer 的 eat/study 实际输出的是 "TennisPlayer..." 字样（源文件字符串复制没改，见 BasketBallPlayer.md），看到输出别以为调错了对象。
