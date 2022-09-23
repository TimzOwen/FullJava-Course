// polymorphism in one language

// to draw shapes without instantiating new obect instance 
// The shape uses the Shape object which is inherited by Circle and Traingle to draw irespective shapes
//without creating new instances on new obects

public class Main {

    public static void main(String[] args) {

     A parentClass = new A();
     parentClass.classA();

     B childClass = new B();
     childClass.classB();
	
    }
}

class A {
    public void classA(){
        System.out.println("this is parent class");
    }
}

class B extends A {
    public void classB(){
        System.out.println("This is child class");
    }
}


