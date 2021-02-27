


    // WHILE LOOP:
    // used mostly when we don't know the exact number of iterations to perform


    int i = 5;
    while(i>0){
      System.out.println("current score: " + i);   //be aware of infinite loops, (dont forget --)
      i--;
    }

    int a =1;
    while(a<=5){
      System.out.println("hello at number: " + a);
      a++;
    }


    // challenge
    // create a program to get user input;
    String extigame = "";
    Scanner scanner = new Scanner(System.in);
    while(!extigame.equals("exit")){
      System.out.print("Input: ");
      extigame = scanner.next().toLowerCase();
      System.out.println("Entered: " + extigame);
    }


    // DO WHILE LOOPS:
    // Always get's executed atleast once:
    // conditions are checked later and not at first


    Scanner scanner = new Scanner(System.in);
    String game = " ";
    do{
      System.out.println("Enter Number: ");
      game = scanner.next();
      System.out.println("You just entered :" + game);
    }while(!game.equals("over"));


    
    // BREAKING AND CONTINUE IN LOOPS:
    // using above example, make sure the "over" is not printed
    String gameover = " ";
    Scanner scanner = new Scanner(System.in);
    while(!gameover.equals("over")){
      System.out.println("Enter Number: ");
      gameover = scanner.next();
      if(!gameover.equals("over"))  // exits without printing 
        System.out.println("Entered: "+ gameover);
    }


    // break without using the ! 
    String gameover = " ";
    Scanner scanner = new Scanner(System.in);
    while(!gameover.equals("over")){
      System.out.println("Enter Number: ");
      gameover = scanner.next();
      if(gameover.equals("over"))
        break;  // exits without printing 
      System.out.println("Entered: "+ gameover);
    }


    // continue;
    // used to move to the start of a loop or next block without breaking a condition
    String gameover = " ";
    Scanner scanner = new Scanner(System.in);
    while(!gameover.equals("over")){
      System.out.println("Enter Number: ");
      gameover = scanner.next();
      if (gameover.equals("pass"))
        continue;
      if(!gameover.equals("over"))  // exits without printing 
        System.out.println("Entered: " + gameover);
    }


    // simplify by removing repeated code:
    String gameover = " ";
    Scanner scanner = new Scanner(System.in);
    while(true){  // simplified 
      System.out.println("Enter Number: ");
      gameover = scanner.next();
      if (gameover.equals("pass"))
        continue;
      if (gameover.equals("over"))  // removed th enot operator and set it to true value
        break;
      System.out.println("Entered: " + gameover);
    }


    // LOOPING ARRAYS: 
    
    String[] laptops = {"Apple","HP","Toshiba","Lenovo"};
    for (int i = 0; i<laptops.length; i++){
      System.out.println(laptops[i]);
    }

    // looping using declared data type
    for (String laptop : laptops){  
      System.out.println(laptop);
    }

