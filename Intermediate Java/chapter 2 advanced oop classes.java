
// Class Inheritance
// Class Inheritance
// Uses the extend Keyword to inherit its performance


//sample created from the calculator
class Calc{
    public int add(int i, int j){   //parent class | Base class | Super Class
        int sum;
        sum = i +j;
        return sum;
    }
}

class AdvCalc extends Calc{     //Child class | Derived class | Sub class
    public int sub(int i,int j){
        int sub;
        sub = i-j;
        return sub;
    }
}


public class Students {

    public static void main(String[] args){

        Calc calc = new Calc();
        System.out.println(calc.add(4,7));

        AdvCalc advCalc = new AdvCalc();
        System.out.println(advCalc.sub(6,5));
        System.out.println(advCalc.add(5,2));

    }
}
    
   

// MULTI LEVEL INHERITANCE

//sample created from the calculator
class Calc{
    public int add(int i, int j){
        return i + j;
    }
}

class AdvCalc extends Calc{
    public int sub(int i,int j){
        return i - j;
    }
}

class VeryAdvancedCAl extends  AdvCalc{      // has sub and add .
    public int mul(int i, int j){
        return i * j;
    }
}


public class Students {

    public static void main(String[] args){


        VeryAdvancedCAl veryAdvancedCAl = new VeryAdvancedCAl();
        System.out.println(veryAdvancedCAl.sub(6,5));
        System.out.println(veryAdvancedCAl.add(5,2));
        System.out.println(veryAdvancedCAl.mul(5,2));

    }
}


// Method overriding



// the subclass overrides the super class

class ParentClass{
    public void display(){
        System.out.println("I am the parent class");
    }
}
class ChildParent extends ParentClass{
        // No Methods
}

public class Students {

    public static void main(String[] args){

        ChildParent parentClass = new ChildParent();
        parentClass.display();    // prints I am the parent class

    }
}




// the subclass overrides the super class

class ParentClass{
    public void display(){
        System.out.println("I am the parent class");
    }
}
class ChildParent extends ParentClass{
    public void display(){
        System.out.println("Child  class");
    }
}

public class Students {

    public static void main(String[] args){

        ChildParent parentClass = new ChildParent();
        parentClass.display();                          // displays Child class and not parent class

    }
}


// using override 
// allows to to check for runtime errors instead of logical errors.
// incase of mispelled methods or functions, the Overrride denotes them with an error

class ParentClass{
    public void display(){
        System.out.println("I am the parent class");
    }
}
class ChildParent extends ParentClass{
    @Override
    public void display(){
        System.out.println("Child  class");
    }
}

public class Students {

    public static void main(String[] args){

        ChildParent parentClass = new ChildParent();
        parentClass.display();                          // displays Child class and not parent class

    }
}



//Super keyword to call 2 methods or functions of a class


class ParentClass{
    public void display(){
        System.out.println("I am the parent class");
    }
}
class ChildParent extends ParentClass{
    public void display(){
        super.display();
        System.out.println("Child  class");
    }
}

public class Students {

    public static void main(String[] args){

        ChildParent parentClass = new ChildParent();
        parentClass.display();  // I am the parent class
                                // I am the Child class

    }
}


// varibale assignment with supper
//Super keyword to call 2 methods or functions of a class


class ParentClass{
    int a;
    public void display(){
        System.out.println("I am the parent class");
    }
}
class ChildParent extends ParentClass{
    int a;
    public void display(){
        super.a = 20;  // assigns the 'a' in Parent class
        super.display();
        System.out.println("Child  class");
    }
}

public class Students {

    public static void main(String[] args){

        ChildParent parentClass = new ChildParent();
        parentClass.display();  // I am the parent class
                                // I am the Child class

    }
}

// Mathematical super example
// Super keyword to call 2 methods or functions of a class

class ParentClass {
    int a, b;

    public int calSum(int a, int b) {
        return a + b;
    }
}

class ChildParent extends ParentClass {
    public int calSub(int a, int b) {
        super.a = a;
        super.b = b;
        return a - b;
    }
}

public class Students {

    public static void main(String[] args) {

        ChildParent parentClass = new ChildParent();
        System.out.println(parentClass.calSub(5, 3));
        System.out.println(parentClass.calSum(10, 20));

    }
}

// RUNTIME & DYNAMIC METHOD DISPATCH
// Super keyword to call 2 methods or functions of a class

class A {
    public void display() {
        System.out.println("I am A");
    }
}

class B extends A {
    public void display() {
        System.out.println("I am B");
    }
}

class C extends A {
    public void display() {
        System.out.println("I am C");
    }
}

public class Students {

    public static void main(String[] args) {

        // use class A but creates object B

        A classA = new B();
        classA.display(); // I am B

        classA = new C();
        classA.display(); // I am C
                          // Dynamic dispath
                          // chaning a method changes its calling

    }
}

// ENCAPSULATION

// Encapsulation---> Binding data with methods
// involves the use of getters and setters methods
// Its variables are always private
// the methods are always name according to its variables names in camel Case

// --> Helps keep your values safe as you cannot modify them outside the class

// --> can also be generated automatically with IDE using (generate getters and
// setter from right clicking)
// -> and going for option the selecting the variable names you want them to
// generate the values

class A {
    private int myAge;
    private String name;

    // setters -->always void
    public void setAge(int age) {
        this.myAge = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getters --> does not take in any arguement
    public int getMyAge() {
        return myAge;
    }

    public String getName() {
        return name;
    }
}

public class Students {

    public static void main(String[] args) {

        // Accessing the varibales
        A a = new A();
        a.setAge(5);
        a.setName("Timz Owen");
        System.out.println(a.getMyAge());
        System.out.println(a.getName());

    }
}



// Wrapper classes and autoboxing 

public class Main {
    public static void main(String[] args) {

        int a = 50; // primitive data types --->primitive variable assignment

        Integer aa = 50;  // wrapper class
                          // Reference variable
                          // = new Integer(50)---> thou was rendered obsolete

        Integer aaa = a;  // This boxing/ wrapping, parsing and int variable to wrapper class
                          // = new Integer(a) -- Thou this became depreciated
                            // Autoboxing

        // Accessing variables

        int b = aaa.intValue(); // thou no need to but for just understanding
                                // Unboxing/ unwraping
        System.out.println(b);

        int bb = aaa; // directly accessing a variable
                      // autoUnboxing
        System.out.println(bb);

    }
}
