# FullJava-Course
working with java from beginer based to fullstack

We get to learn from beginner to intermediate and expert level in java


For the first course we get to learn:

    1. Configuration and Installation
    2. Running Hello world program
    3. Introduction to Varibales and Data Types
    4. Java Strings
    5. Strings in Java
    6. Arrays in Java
    7. Mathematical Operations
    8. Control Statements and Conditional statements.


## Get familiar with some Java General Knowldge.

### Classes and Objects

__Class__: is a user defined blueprint or prototype from which a __objects__ are created

Example: (insert picture of Dog): Datamember-->breed
                                  Method-->(Running/ Eating)

__Object__: Self contained component which contain state/attributes/behaviour or method

    are also instances of the class

### JDK , JRE and JVM?


__JDK__: software development environment used for developing java application and appletss.

    Includes Java Runtime Envinroment (JRE), an interperter/Loader (java), a compiler (javac),

    an archiver (jar), a documentation generator (javadoc) and other tools needed on java development

__JVM__: converts byte code to machine specific code. Its interface does not depend on hardware.

    Its platform dependent and provides core java functions like Garbage Collection

### Java is platform independent?

Supports the (Write once Run anywhare) . When running a java program it gets converted to byte code 

from source code. With JVM java is independednt on machine's hardware

### Garbage Collection

During this process, memory used by the object is automatically returned once all reference are gone.


### Why is Java not 100% programming Languge?

Because it supports primitive data type such as Long, byte......which are not objects

### How Does java enable high perfomance 

Uses Just in Time Compiler (JIT) to enable high perfomance. 

JIT is used to conver instructions to bytecodes

### What Gives java (WORA)?--> Write Once Run Anywhere

The bytcodes: Java compiler converts java programs into a class file(Byte Code) which is the intermediate 

Language between source code and byte code. This byte code is not platform specific making cross-platform.

### Difference between == and .equal() methods.

__.equal()__ is a method
    
    is a content comparison

 __==__ is an operator.

    is used for address comparison

__Example:__

    import java.util.Scanner;

    public class CodeJava {
        public static void main(String[] args){ 

            String one = new String("Hello");
            String one1 = new String("Hello");

            System.out.println(one == one1);        //False
            System.out.println(one.equals(one1));       // True

        } 
    }


### What are OOP Concept in Java?

OOP is the obstraction of objects in the realworld application. Objects are instnaces of classes

