package Basics;

public class StaticDemo {
     int n = 10;
//     static int n = 10; if variable is static means it will use one memory pool
//    because of that everytime an increament is happening it will inrease
//    common variable everytime that time value would be 13

    void inc(){
        n = n+1;
    }

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        StaticDemo staticDemo2 = new StaticDemo();
        StaticDemo staticDemo3 = new StaticDemo();

        staticDemo.inc();
        staticDemo2.inc();
        staticDemo3.inc();

        System.out.println(staticDemo.n);
        System.out.println(staticDemo2.n);
        System.out.println(staticDemo3.n);
    }


    static {
        System.out.println("this will execute first as it is static block");
    }
}
