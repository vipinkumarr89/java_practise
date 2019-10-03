// this program we have three class
// Basics.A, Basics.B and Basics.InheritanceDemo
// And Basics.A,Basics.B class have one constructor and one display method
// and we are going to override this display method
// The moment we will create an object of class Basics.B it will call the
// constructor of Basics.B and as Basics.B extends Basics.A it will call constructor of Basics.A
// and whatever is there in constructor Basics.A will print first followed
// by constructor
// Every class is child of java.lang.Object class and that is why we
// can use super in the parent class as well

package Basics;
class A extends java.lang.Object{
    A() {
        int var1 = 10;
        System.out.println("Inside class Basics.A");
    }

    void display() {
        System.out.println("In display method --> Class Basics.A" );
    }
}

class B extends A {
    B() {
        int var1 = 20;
        System.out.println("Inside class Basics.B");
    }

    @Override
    void display(){
        System.out.println("In display method --> Class Basics.B" );
        super.display();
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
