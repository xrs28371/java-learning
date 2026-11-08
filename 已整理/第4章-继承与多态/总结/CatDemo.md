# CatDemo.java 总结

- 内容：测试类，`main` 方法里先 `new CatOperater()` 得到操作类对象 `a`，再 `new Cat()` 得到猫对象 `c`，最后调用 `a.useCat(c)`，把猫对象作为实参传进去；运行输出 "Cat eat fish"。
- 知识点：「类作为形式参数」的完整调用链——创建被操作类对象（Cat）→ 创建操作类对象（CatOperater）→ 把被操作对象当实参传给操作类的方法（useCat）。实参是对象的引用，方法内部拿到的是同一个对象，调的就是它的 `eat()`。
- 易错点：别把传对象的 `a.useCat(c)` 和传基本类型的值混为一谈——传对象传的是引用，方法里对对象成员的改动会影响原对象；`new CatOperater()` 这一层容易漏写（没有操作类对象就调不了 `useCat`）；`main` 方法签名 `public static void main(String[] args)` 一个字母都不能错。
