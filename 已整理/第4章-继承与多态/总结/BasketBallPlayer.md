# BasketBallPlayer.java 总结

- 内容：具体类，继承 Player，实现 `study()` 和 `eat()`，没有实现 English 接口（篮球运动员不会说英语这条线）。
- 知识点：具体子类实现 Player 线积累的 study＋eat 两个抽象方法后即可实例化；与 TennisPlayer 对照看「实现不实现接口」的差别。
- 易错点（真 bug）：两个方法的输出字符串写的是 "TennisPlayer study" 和 "TennisPlayer eat"——从 TennisPlayer 复制过来忘了改类名。能编译能运行，但运行时输出对不上对象，实测/按输出判分必丢分，复制代码后先改字符串。
