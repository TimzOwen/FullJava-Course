
// LOGICAL CONTROL STATEMENTS IN JAVA:
    // Used to compare primitive values:

    //comparison operators 
    // == --> Equal, >= --> greater/equal to, <= --> less/equal  != --> Not eqaul
    int speed = 50;
    int fuelConsumption = 50;
    
    System.out.println(speed == fuelConsumption); // returns a boolean (True)
    System.out.println(speed != fuelConsumption); // False
    System.out.println(speed <= fuelConsumption);
    System.out.println(speed >= fuelConsumption);


    //logical operators
    // Logical AND operator (&&)

    int speed = 100;
    boolean isBMW = speed>300 && speed<500; // checks for both conditions from left to right. 
    System.out.println(isBMW);

    // OR operator (||)
    // is true if either of the conditions is met;

    boolean hasExperience = true;
    boolean hasGraduated = false;
    System.out.println(hasExperience || hasGraduated); // True


    //COMBINED OPERATIONS
    boolean hasExperience = true;
    boolean hasGraduated = true;
    boolean hasIncompleteUnits = false;  // to be eligible there must no be incomplete units to be employed
    System.out.println((hasExperience || hasGraduated) && !hasIncompleteUnits); // ! reverses the statement


