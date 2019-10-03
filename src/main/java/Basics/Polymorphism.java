package Basics;

class Aclass{
    Aclass(){
        System.out.println("Inside Basics.A constructor");
    }
    void display(){
        System.out.println("in Basics.A");
    }
}

class Bclass extends Aclass{
    Bclass(){
        System.out.println("Inside Basics.B constructor");
    }
    @Override
    void display(){
        System.out.println("In Basics.B");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Aclass aclass = new Bclass();
        aclass.display();
    }
}


// this is runtime polymorphism as we can see that
// <object_type> is of class Basics.B while <object_ref> os of class Basics.A
// and that is why display method of class Basics.B will get execute
// the type of object is defined at run time rather compile time