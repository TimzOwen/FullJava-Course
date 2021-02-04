
import java.util.Date;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

// Welcome to Java Programming

public class fullJavaCourse{
    public static void main (String[] args){
       // CHAPTER 1
       // LESSON ONE

        //printing hello world in java 
        System.out.println("Welcome to Java Programming");
        System.out.println("Here to code Java");   
    
        //TYPES IN JAVA

        //Variables
        // follows the camelCase naming convention
        
        // myAge is also refered as identifier 
        // has '=' assignment operator
        int myAge = 50;
        System.out.println(myAge); 

        myAge = 70;  // reinitializing values to another integer
        System.out.println(myAge);

        // multiline declaration
        int age = 20, score = 4;
        System.out.println( score + age);

        // Variable reasignment
        int myScore = 8;
        int teamC = myScore;
        System.out.println(teamC);



        // LESSON 2:
        // PRIMITIVE TYPES.
        
        // Full int:
         //   byte, short, int, long
        //Flaoting point
          //  float and Double
        //Characters
           // char
        //Booleans
          //  True / False

        byte price = 40;
        Long totalCount = 5_400_560_800L;
        boolean hasCoffee = false;
        char firstName = 'A';
        double discount = 99.99;

        System.out.println("Price: " + price + "\n count:" + totalCount + "\n Coffee: " + hasCoffee + "\n discount: " + discount + "\n First Name char : " + firstName);
        

        // REFERENCE TYPE:
        // Require memory allocation with "new" keyword
        Date todaysDate = new Date();
        System.out.println(todaysDate); //returns current date and time

        //REFERENCE 

    }
}
