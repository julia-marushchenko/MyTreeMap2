/**
* Java program to demonstrate TreeMap usage.
*/

import java.util.*;

/**
* Main class.
*/
public class Main {

    // Main method to drive java program.
    public static void main(String[] str) {
    
        // Creating an empty TreeMap. 
        Map<Integer, String> myMap = new TreeMap<>();
        
        // Adding pairs to myMap. 
        myMap.put(1, "Coffee");
        myMap.put(4, "Tee");
        myMap.put(2, "Smoothie");
        myMap.put(3, "Fresh");
        myMap.put(5, "Cacao");
        
        
        // Printing keys and values of myMap to console.
        System.out.println(myMap); //Output:{1=Coffee, 2=Smoothie, 3=Fresh, 4=Tee, 5=Cacao}
        
    }
}
