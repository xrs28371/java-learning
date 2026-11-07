# AnimalOperater.java 总结

- 内容：动物操作类，提供 `useAnimal(Cat c)` 方法，内部调用 `c.eat()`。配合 AnimalDemo1.java 使用：传一只 Cat 进去，就会执行 Cat 重写后的 `eat()`，输出「猫吃鱼」。
- 知识点：这是「多态的好处」一节的标准套路——把操作抽成独立方法，调用者只管传对象、不管具体是哪种动物。但注意：**这个版本的参数类型写的是 `Cat`，不是 `Animal`**，所以它现在只能接 Cat，接不了 Dog 或其他动物，多态「一套代码适配多种子类」的好处还没体现出来；改成 `useAnimal(Animal a)` 后，传 Cat、Dog 都能用同一个方法，才是课本上讲的多态应用。
- 易错点：**类名拼写错误**：`AnimalOperater` 应为 `AnimalOperator`（operator 错写成 operater），类名一旦定错，new 和引用处都得跟着错；笔试写类名、方法名时先默念一遍拼写。方法参数类型决定了能传什么：形参是 Cat，实参只能是 Cat 或其子类；想传任意动物，形参必须写父类 Animal。
