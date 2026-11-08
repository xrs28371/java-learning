# TennisCoach.java 总结

- 内容：具体类，`extends Coach implements English`，实现 `teach()`、`eat()` 和接口的 `speak()` 三个方法。
- 知识点：一个类可以「先继承一个父类、同时实现接口」——写法 extends 在前、implements 在后；只有网球线实现 English 接口，篮球线不实现，这就是接口的按需附加：不是所有子类都需要的能力，不要塞进父类。
- 易错点：实现接口方法时权限必须是 public，不能降为默认（接口方法默认 public，实现时写小了编译报错）；输出字符串 "how tu play" 同样有 tu 笔误。
