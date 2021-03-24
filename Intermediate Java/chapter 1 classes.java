

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
