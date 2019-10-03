package Basics;

public class Employee {
    // its not manadatory to make this class public

     //    Member Data Variable
     int empno;
     String ename;
     int sal;

     Employee(){
         System.out.println("In constructor");
         empno = 1000;
         ename = "Vipin";
         sal = 100000;
     }

     void displayEmployee() {
         System.out.println(empno + "|" + ename + "|" + sal);
     }
    // So this is clear that we can have more than one main method in a program and can have multiple classes
//     and equivalent number of classes will get created upon compiling the program
     public static void main(String[] args) {
         System.out.println("Inside Basics.Employee Class");
     }
 }

    class Object1{
    public static void main(String[] args) {
        Employee emp = new Employee();
//        <object_type> <object_ref>  = new <object_type>(arguments);
        emp.sal = 10000;
        emp.ename = "Vipin";
        emp.empno = 1001;

//        System.out.println(emp.empno + "|" + emp.ename+"|"+emp.sal);
//        When we are calling displayEmployee() method
//        it doesn't require object reference like emp.empno
        emp.displayEmployee();
//        object contain state and behavior where
//        state is member data value and
//        behavior is functionality
    }
}

// When a method doesn't have a return type called as constructor and one default
// constructor gets created automatically when you compile to code and can be checked
// using javap Basics.Employee
// In short no return type and name as class name and gets executed when an object
// of class is created and used to initialize the member datas of an object
// And are of two types 1. default 2. Parameterized constructor

