# TennisPlayer.java 总结

- 内容：具体类，`extends Player implements English`，实现 `study()`、`eat()`、`speak()` 三个方法，是 PersonDemo 里被测的主角。
- 知识点：网球线（运动员＋教练）都实现 English 接口，对应题目设定「网球运动员/教练要会说英语」；实现类必须把继承的抽象方法＋接口方法全部实现齐。
- 易错点：类名拼写 BasketBallPlayer 的 B 大写在两个文件里要一致（Java 类名大小写敏感，引用对不上就编译报错）；本文件字符串内容正确，可作 BasketBallPlayer 的对照。
