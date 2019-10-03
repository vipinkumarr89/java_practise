package Basics;

import static java.lang.Math.PI;

abstract class Shape{ // this class is abstract because it contain one abstract method
String color;

    Shape(String color) {
        this.color = color;
    }

    private String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    abstract public void area();
    // if I will create this method without body compiler won't allow this
    // and we want child class to override the area method, so in order to
    // create a method without body we need to define it as abstract method
    // and if any of the method of the class is abstract the class has to be
    // abstract
}

class Rectangle extends Shape {
    // this rectangle class is also abstract as it extend one abstract class
    int length, breath;

    // in Basics.Rectangle constructor we don't have color so to fetch it from
    // super class we need to use super keyword to fetch it from super(Basics.Shape) class
    public Rectangle(int length, int breath, String color) {
        super(color);
        this.length = length;
        this.breath = breath;
    }

    @Override
    public void area() {
        System.out.println("Area of Basics.Shape: "+ length*breath +" with color "+ "'" + color +"'");
    }
}

class Circle extends Shape{
    int radius;

    public Circle(int radius, String color) {
        super( color );
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of Basics.Circle is: "+PI*Math.pow(radius,2));

    }
}


public class AbstractionDemo {
    public static void main(String[] args) {
        // Basics.Shape shape = new Basics.Shape(); // this will throw error because abstract
        // class can't be instantiated and it will throw error like below
        // error: Basics.Shape is abstract; cannot be instantiated
        Shape shape = new Rectangle(4,3,"yellow");
        shape.area();

        Shape shape1 = new Circle( 4,"Red");
        shape1.area();
    }
}

// in this example we have learnt what is abstract and how to hide the implementation
// by hiding the actual Class where implementation is there
// like Basics.Rectangle and Basics.Circle for any other shape, we need to create a class and
// extend Basics.Shape class and by doing so it will become Abstract and you need to
// implement/override area method and define the input values like radius in case of
// circle and length and breadth at instance level and then create a constructor which
// Will automatically inherit the shape color from super class
