public class Outer1 {
    private int num=10;
    /*public class Inner{
        public void show(){
            System.out.println(num);
        }

    }

     */
    //一般用private
      private class Inner{
        public void show(){
            System.out.println(num);
        }

    }

    public void method(){
          Inner i=new Inner();
          i.show();
    }

}
