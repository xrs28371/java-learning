public class StudentDemo {
    //成员变量
   String name;
   //int age;
   private int age;

   //成员方法
   public void study(){
         System.out.println("Study is called");
   }

   public void doHomework()
   {
      System.out.println("Do Homework is called");
   }
   public void show()
   {
      System.out.println(name+age);
   }
   public void setAge(int a)
   {
      if(a<0||a>100)
      {
         System.out.println("Invalid Age");
      }
      else
      {
         age=a;
      }
   }

   public int getAge()
   {
      return age;
   }
   //private关键字
   //是一个权限修饰符
   //可以 修饰成员
   //保护成员不被别的类使用，被private修饰的成员只在本类中才能访问

   //针对private修饰的成员变量 ，如果需要被其他类使用，提供相应的操作
   //get变量名() 方法用public修饰
   //set变量名（参数）设置成员变量的值，用public修饰





}
