
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

