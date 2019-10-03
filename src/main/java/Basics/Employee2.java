package Basics;

public class Employee2 {

    // these three variables are instance variable
    int empno;
    String ename;
    int sal;

    // First constructor
    Employee2(){
        System.out.println("In constructor");
        empno = 1000;
        ename = "Vipin";
        sal = 100;
    }

    // Second constructor or parameterised constructor for overloading
    // variable ename in Basics.Employee2(String pename) is local variable
    // in order to set the value for instance variable we have to use this keyword
    Employee2(String ename){
        System.out.println("In overloading constructor");
        empno = 999;
        this.ename = ename;
        sal = 100;
    }

    void displayEmployee() {
        System.out.println(empno + "|" + ename + "|" + sal);
    }
}

class Object2{
    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        Employee2 emp2 = new Employee2();
        Employee2 emp3 = new Employee2("arun");

//        emp.sal = 10000;
//        emp.ename = "Vipin";
//        emp.empno = 1001;
        emp.displayEmployee();
        emp2.displayEmployee();
        emp3.displayEmployee();

    }
}

// When a method doesn't have a return type called as constructor and one default
// constructor gets created automatically when you compile to code and can be checked
// using javap Basics.Employee
// In short no return type and name as class name and gets executed when an object
// of class is created and used to initialize the member datas of an object
// And are of two types 1. default 2. Parameterized constructor

