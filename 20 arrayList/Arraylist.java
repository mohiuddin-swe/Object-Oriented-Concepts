import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
 public static void main(String[] args){

    ArrayList<String> people = new ArrayList<String>();

    people.add("Mohiuddin");
    people.add("Sabbir");
    people.add("Akbar");
    people.add("Sanjoy");

    /* people.set(1,"Sourab");

    people.remove(2); */

    //System.out.println(people);

   /*  for (int i = 0; i < 4; i++) {
      System.out.println(people.get(i));
    } */
   
   Collections.sort(people);
   
    for(String i:people){
      System.out.println(i);
    }

  }
} 

/*
//Java ArrayList

//The ArrayList class is a resizable array, which can be found in the java.util package.

import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
*/



//Change an Item
//cars.set(0, "Opel");

//Remove an Item
//cars.remove(0);

//To remove all the elements in the ArrayList, use the clear() method:
//cars.clear();

//ArrayList Size
//cars.size();

//Loop Through an ArrayList

/* import java.util.ArrayList;
public class Arraylist {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (int i = 0; i <4; i++) {
      System.out.println(cars.get(i));
    }
  }
} */



//ArrayList with the for-each loop:
/*
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (String i : cars) {
      System.out.println(i);
    }
  }
}

*/



//Other Types-Create an ArrayList to store numbers (add elements of type Integer):

/*
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}
*/



/*

//Sort an ArrayList of Strings:
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Collections.sort(cars);  // Sort cars
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
*/



//Sort an ArrayList of Integers:
/*
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);

    Collections.sort(myNumbers);  // Sort myNumbers

    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}

*/


