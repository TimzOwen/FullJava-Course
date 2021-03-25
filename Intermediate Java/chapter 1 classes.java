

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



// This Key word in JAVA

//
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

// instance variable and local varibale scope
import java.awt.*;
import java.util.Scanner;

class Calculator{
    // instance variables
    int num1, num2;

    //public function to make it accessible
    public Calculator(int num1, int num2){
      //default constructor which gets called when object has been created

        //instance variable     Local varibale
        num1        =           num1;
        num2        =           num2;
    }
}

public class FullCourseJava {

    public static void main(String[] args) {

        Calculator calculate = new Calculator(4, 10);

        System.out.println(calculate.num1); // returns 0
        System.out.println(calculate.num2); // reuturns 0

    }
}


// Solution
import java.awt.*;
import java.util.Scanner;

class Calculator {
    // instance variables
    int num1, num2;

    // public function to make it accessible
    public Calculator(int num1, int num2) {
        // default constructor which gets called when object has been created

        // use 'this' keyword to specify that its instance and not local variable you
        // are using

        this.num1 = num1;
        this.num2 = num2;
    }
}

public class FullCourseJava {

    public static void main(String[] args) {

        Calculator calculate = new Calculator(4, 10);

        System.out.println(calculate.num1); // returns 0 becuse both are takng local instance
        System.out.println(calculate.num2); // reuturns 0

    }
}



// METHODS AND CONSTRUCTOR OVERLOADING
import java.awt.*;
import java.util.Scanner;

// Constructor overloading

class Calculator {
    // instance variables
    int num1, num2;

    // public function to make it accessible
    public Calculator(int num1, int num2) {
        // default constructor which gets called when object has been created
        // use 'this' keyword to specify that its instance and not local variable you
        // are using
        this.num1 = num1;
        this.num2 = num2;
    }

    // constructor overloading allows you to use same function name with different
    // parameter

    public void calculateSum(int a, int b) {
        System.out.println(a + b);
    }

    public void calculateSum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void calculateSum(double a, int b, int c) {
        System.out.println(a + b + c);
    }
}

public class FullCourseJava {
    public static void main(String[] args) {
        Calculator calculate = new Calculator(4, 10);
        System.out.println(calculate.num1); // returns 0 because both are taking local instance
        calculate.calculateSum(4, 5);
        calculate.calculateSum(5.5, 2, 2);
        calculate.calculateSum(4, 4, 4);

    }
}



// CONSTRUCTORS OVERLOADING

// Constructor overloading

class Calculator {
    // instance variables
    int num1, num2;
    String userName;

    public Calculator() { // constructor 1
        num1 = 0;
        num2 = 1;
        userName = "no name";
    }

    public Calculator(int i) { // constructor 2
        num1 = i;
        num2 = 0;
        userName = "no name";
    }

    public Calculator(int i, int j) { // constructor number 3
        num1 = i;
        num2 = j;
        userName = "No name";
    }

    public Calculator(int i, int j, String name) { // constructor number 4
        num1 = i;
        num2 = j;
        userName = name;
    }
}

public class FullCourseJava {
    public static void main(String[] args) {
        Calculator calculate = new Calculator(); // calls cons 1
        Calculator cal2 = new Calculator(4); // calls cons 2
        Calculator cal3 = new Calculator(4, 5); // calls cons 3
        Calculator cal4 = new Calculator(3, 5, "owen"); // calls cons number 4
    }
}





// JAVA STATIC KEY WORDS

class Lec{
    int id;
    double salary;
    String hod;

    //create a function to show the data
    public void showData(){
        System.out.println(hod + " id number: " + id + " Salary: " + salary);
    }
}

public class Students {
    public static void main(String[] args){

        Lec lecEducation = new Lec();
        lecEducation.salary = 5000.50;
        lecEducation.hod = "prof Ngala";
        lecEducation.id = 35419092;

        Lec lecEngineering = new Lec();
        lecEngineering.salary = 6000.50;
        lecEngineering.hod = "prof Ragama";
        lecEngineering.id = 354767594;

        lecEducation.showData();
        lecEngineering.showData();
       
    }
}


// static implementation

// understanding static in Classes:
// static makes sure one value is set to all classes and one change changes all the other
// makes sure its not object specific

class Lec{
    int id;
    double salary;
    static String hod;

    //create a function to show the data
    public void showData(){
        System.out.println(hod + " id number: " + id + " Salary: " + salary);
    }
}

public class Students {
    public static void main(String[] args){  // method is static because we dont need an object to run it

        Lec lecEducation = new Lec();
        lecEducation.salary = 5000.50;
        // use the class reference since its static and no need of object
        Lec.hod = "prof Ngala";
        lecEducation.id = 35419092;

        Lec lecEngineering = new Lec();
        lecEngineering.salary = 6000.50;
        Lec.hod = "prof wanyama";           // overides both values to professor Wanyama
        lecEngineering.id = 354767594;

        lecEducation.showData();
        lecEngineering.showData();

    }
}



// static declaration

// static declaration:


class Lec{
    int id;
    double salary;
    static String hod;

    static {
        hod = "Prof Mutinda";
    }

    // default constructor

    public Lec(){
        id = 1;
        salary = 10000;
    }

    //create a function to show the data
    public void showData(){
        System.out.println(hod + " id number: " + id + " Salary: " + salary);
    }
}

public class Students {
    public static void main(String[] args){  // method is static because we dont need an object to run it

        Lec lecEducation = new Lec();

        Lec lecEngineering = new Lec();

        lecEducation.showData();
        lecEngineering.showData();

    }
}




// Number of times a static is called

// static declaration:


class Lec{
    int id;
    double salary;
    static String hod;

    static {   // called only once when you laod a class
        hod = "Prof Mutinda";
        System.out.println("I am just called once");
    }

    // default constructor

    public Lec(){     // called when you create an object. that's why its printed twice
        id = 1;
        salary = 10000;
        System.out.println("I have been called twice");
    }

    //create a function to show the data
    public void showData(){
        System.out.println(hod + " id number: " + id + " Salary: " + salary);
    }
}

public class Students {
    public static void main(String[] args){  // method is static because we dont need an object to run it

        Lec lecEducation = new Lec();

        Lec lecEngineering = new Lec();

        lecEducation.showData();
        lecEngineering.showData();

    }
}


// static declaration

// static declaration:


class Lec{
    int id;
    double salary;
    static String hod;

    static {
        hod = "Prof Mutinda";
    }

    // default constructor

    public Lec(){
        id = 1;
        salary = 10000;
    }

    //create a function to show the data
    public void showData(){
        System.out.println(hod + " id number: " + id + " Salary: " + salary);
    }
}

public class Students {
    public static void main(String[] args){  // method is static because we dont need an object to run it

        Lec lecEducation = new Lec();

        Lec lecEngineering = new Lec();

        lecEducation.showData();
        lecEngineering.showData();

    }
}


// Number of times a static is called

// static declaration:


class Lec{
    int id;
    double salary;
    static String hod;

    static {   // called only once when you laod a class
        hod = "Prof Mutinda";
        System.out.println("I am just called once");
    }

    // default constructor

    public Lec(){     // called when you create an object. that's why its printed twice
        id = 1;
        salary = 10000;
        System.out.println("I have been called twice");
    }

    //create a function to show the data
    public void showData(){
        System.out.println(hod + " id number: " + id + " Salary: " + salary);
    }
}

public class Students {
    public static void main(String[] args){  // method is static because we dont need an object to run it

        Lec lecEducation = new Lec();

        Lec lecEngineering = new Lec();

        lecEducation.showData();
        lecEngineering.showData();

    }
}



// INNER CLASSES

// Outer and Inner classes declaration
class OutterCLass{      //saved as outterCLass.class
    int total_cost;
    String employees;

    public void checkClass(){
        System.out.println("This is a function of the outer class");
    }

    //create another class
    class InnerClass{   // will bes saved in a file as Outer$Inner.class
        int total_cost;
        String employees;

        public void displaySomething(){
            System.out.println("I am inner class in outer class");
        }
    }
}

//another class:
class ClassTwo{     // Saved in a file as ClassTwo.java
    int employees;
    String users;

    public void total_users(){
        System.out.println("We have many user in the server");
    }
}

public class Students {
    public static void main(String[] args){

        // instantiate the out class by calling its object
        OutterCLass outterCLass = new OutterCLass();
        outterCLass.checkClass();

        // to instantiate and use methods of inner class, use the dot. with inner class
        OutterCLass.InnerClass innerClass = outterCLass.new InnerClass();

        // now start performing other operations on the class
        innerClass.displaySomething();

        // the second class
        ClassTwo classTwo = new ClassTwo();
         classTwo.total_users();

    }
}


// static classes and how to access its members and variable from the main function in the class

// Outer and Inner classes declaration
class OutterCLass{
    static int total_cost;
    static String employees;

    public static void checkClass(){
        System.out.println("This is a function of the outer class");
    }

    //create another class
    static class InnerClass{
        int total_cost;
        String employees;

        public static void displaySomething(){
            System.out.println("I am inner class in outer class");
        }
    }
}

//another static classes and Functions

class ClassTwo{
    static int employees;
    String users;

    public static void total_users(){
        System.out.println("We have many user in the server");
    }
}

public class Students {
    public static void main(String[] args){

        // instantiate the out class by calling its object
        OutterCLass outterCLass = new OutterCLass();
        outterCLass.checkClass();

        // to instantiate and use methods of inner class, use the dot. with inner class
        OutterCLass.InnerClass innerClass = new OutterCLass.InnerClass();

        // now start performing other operations on the class
        innerClass.displaySomething();

        ClassTwo classTwo = new ClassTwo();
        classTwo.total_users();

    }
}

// Create a class that takes in a number of the parameter and performs multiplication or additions without 
// declaring its valeus each time
// VARARGS in java programming and Classes
// Variable Length Argument

class Calc{
    public int add(int...s){   // Variable Length arguments.
        int sum = 0;
        for (int i : s){
            sum += i;
        }
        return sum;
    }
}
public class Students {
    public static void main(String[] args){

        Calc calc = new Calc();
        System.out.println(calc.add(4,3,4,5));
    }
}
