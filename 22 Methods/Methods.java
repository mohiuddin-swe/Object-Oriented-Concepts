//Java Class Methods

/*public class Main {
  static void myMethod() {
    System.out.println("Hello World!");
  }
}
*/


/*public class Main {
  static void myMethod() {
    System.out.println("Hello World!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

// Outputs "Hello World!"*/




///Static vs. Public
/*

public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method on the object
  }
}
*/



//Access Methods With an Object


/*
// Create a Main class
public class Main {
 
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Main myCar = new Main();   // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}

// The car is going as fast as it can!
// Max speed is: 200
*/




/*Using Multiple Classes
Like we specified in the Classes chapter, it is a good practice to create an object of a class and access it in another class.

Remember that the name of the java file should match the class name. In this example, we have created two files in the same directory:

//Main.java
public class Main {
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
}


//Second.java

class Second {
  public static void main(String[] args) {
    Main myCar = new Main();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}



*/








//Call a method from main method

  /* static void sabbir() {
    System.out.println("I just got executed! i am sabbir");
  }

  public static void main(String[] args) {
    sabbir();
    sabbir();
    sabbir();
    sabbir();
    sabbir();
    sabbir();
    sabbir();
    sabbir();
  } */

  /* //parameter passing
  static void emon(String meye, int age){
    System.out.println(meye + age);
  }

  public static void main(String[] args) {

    emon("Liza ",50);
    emon("Lima ",50);
    emon("Lamia ",50);
    emon("Sadia ",50);
    emon("Sarah  ",50);

  } */

public class Methods {
  static int myMethod(int x, int y) {
    return x+y;
  }


  public static void main(String[] args) {
    
  System.out.println(myMethod(5,10));
  }

}
