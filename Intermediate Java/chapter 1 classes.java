

// classes and Objects
// objects and blueprint

// Building and architecture is the blue-print of the final desired building or
// object----> blueprint(=class)
// every object has behaviour and values

// architecture

class Calculator{

    // behavior and attribute of the class here

}

public class Calculator {
    public static void main(String[] args) {

        // call the function here after creating an object instance of it.
        System.out.println(" hello java classes ");

        Calculator calc = new Calculator(); // creating an object
        // calc.attribute/value
    }
}



// return values from a function
import java.awt.*;
import java.util.Scanner;

class Calculator{
    // attributes
    int a;
    int b;
    int results;

    //public function to make it accessible
    public void calculate(){
        results = a + b;
    }
    
}

public class FullCourseJava {

    public static void main(String[] args) {

        Calculator calculate = new Calculator();
        calculate.a = 5;
        calculate.b = 5;

        calculate.calculate();

        System.out.println(calculate.results); // returns 10

    }
}


// Constructor in Java
// The constructor name shoud be same as the class name, have no return types,
// Default constructors are always there,
// Construtors is a member method, Used to allocare memory
// Constructor overloadoing--> multiple constructors (some have parameters )
// Build a calculator with a funciton inside that calculates the sum of two
// numbers

import java.awt.*;
import java.util.Scanner;

class Calculator{
    // attributes
    int a;
    int b;

    //public function to make it accessible
    public Calculator(){
      // default constructor which gets called when object has been created
        a =15;
        b = 20;
    }
    // one parameter constructor
    public Calculator(int n){
        a = n;  //updating assigned values
    }
    // multiple parameter constructor
    public Calculator(int c, int d){
        b = 22;
        a = c;
        b = d;
    }
}

public class FullCourseJava {

    public static void main(String[] args) {

        Calculator calculate = new Calculator();
        System.out.println(calculate.b); // b remains with its default value

        Calculator cal2 = new Calculator(8, 5);
        System.out.println(cal2.b); // b is updated to 5

        Calculator cal3 = new Calculator(4);
        System.out.println(cal3.a); // a gets updated to 4
    }
}

import java.awt.*;
import java.util.Scanner;

class Calculator{
    // instance variables
    int num1, num2;

    //public function to make it accessible
    public Calculator(int number1, int number2){
      //default constructor which gets called when object has been created
        num1 = number1;
        num2 = number2;
    }
}

public class FullCourseJava {

    public static void main(String[] args) {

        Calculator calculate = new Calculator(4, 10);

        System.out.println(calculate.num1);
        System.out.println(calculate.num2);

    }
}
// Constructor parameters

import java.awt.*;
import java.util.Scanner;

class Calculator{
    // attributes
   int results;

   public Calculator(){
       // this is the default constructor
       // No return types
       // Called automatically when the object is created
   }

    //public function to make it accessible
    public void calculate(int a, int b){
        results = a + b;
        System.out.println("The result is: " + results);
    }
    
}

public class FullCourseJava {

    public static void main(String[] args) {

        Calculator calculate = new Calculator();
        calculate.calculate(8, 6);

    }
}
