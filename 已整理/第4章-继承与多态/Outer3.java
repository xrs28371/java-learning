public class Outer3 {
    public void method(){
        /*
        new Inter(){
            @Override
            public void show(){
                System.out.println("show");
            }
        };

         */

        /*
        new Inter(){
            @Override
            public void show(){
                System.out.println("show");
            }
        }.show();//调用了show 方法

        new Inter(){
            @Override
            public void show(){
                System.out.println("show");
            }
        }.show();//调用了show 方法


         */
        //二次调用

        Inter i=new Inter(){
            @Override
            public void show(){
                System.out.println("show");
            }
        };

        i.show();
        i.show();
        i.show();
        i.show();
        i.show();
        i.show();
        i.show();
        i.show();

    }
}
