

    // MATHS OPERATION IN JAVA
    // Performing maths operations in java

    //Rounding float numbers to integers
    int roundFloat = Math.round(5.50F);  // returns 6:

    //Ceiling:
    // return the closest integer close to the Floating point equal to or greater than it:
    int ceilRound = (int)Math.ceil(5.3F); //6
    int ceil2Round = (int)Math.ceil(60.567);

    //floor
    //returns the smallest or value equal to the one passed.
    int floorInt = (int)Math.floor(50.34);

    // Max,min
    //return maximum and minimum of the values passed
    int maxValue = Math.max(20, 30); // 30
    int minValue = Math.min(20, 30); //20

    //Random
    // used for generating random values from 0-1
    double randomNumber = Math.random();
    double randomZero2Ten = Math.random() * 10; // random between 0 and 10
    int randomInt = (int)Math.round(Math.random() * 100); // roudn into integers
    int randomNoRound = (int) (Math.random() * 100);

    
    
    // Working with Numbers
    // Formating the Numbers

    // working with Currency convertions:
    NumberFormat localCurrency =  NumberFormat.getCurrencyInstance();
    String marketCurrency = localCurrency.format(98756437.50); 

    // Percentage instance convertions:
    NumberFormat currentRate = NumberFormat.getPercentInstance();
    String converted = currentRate.format(0.5);

    // Method chaining for Repeated Methods
    String currencyUpdate = NumberFormat.getPercentInstance().format(0.79);  
