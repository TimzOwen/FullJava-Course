
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
    
