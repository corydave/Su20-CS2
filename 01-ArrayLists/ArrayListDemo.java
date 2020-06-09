// Dave Ghidiu
// ArrayList Demo


/*
Arrays in Java have some limitations
  - You can't change the size of an array
  - System.out.println(thisArray); // a[]@a45F3
  - Can't insert easily
  
ArrayList (java.util.ArrayList)
 - You CAN change the size of an ArrayList!
 - System.out.println(thisArrayList); // All the elements, nice and cool!
 - You CAN insert easily
 - You CANNOT put in primitive data types // Autoboxing

STRING API
https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html

OBJECT API
https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html

*/



import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayListDemo {
    
    public static void main (String[] args) {
        
        System.out.println("Welcome to the ArrayList Demo");
        Scanner scanner = new Scanner(System.in);
        
        // How to create an array of Strings
        String[] stringArray = new String[5];
        stringArray[0] = "Apple";
        stringArray[1] = "Banana";
        stringArray[2] = "Crunchwrap Supreme";
        stringArray[3] = "Delicious Apple";
        stringArray[4] = "E";
        
        System.out.println();
        
        System.out.println("The ARRAY output is:");
        System.out.println(stringArray);
        System.out.println(stringArray.length);
        
        // How to create an ArrayList of Strings
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Iron Man"); // Index #0
        stringArrayList.add("Black Widow"); // Index #1 (now it's #2!)

        System.out.println();
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.size());        
        
        stringArrayList.add(1, "Quicksilver"); // Index #1
        
        // Output the ArrayList by invoking the 'toString()' method on each element in the ArrayList
        System.out.println();
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.size());
        
        stringArrayList.remove(0);
        
        System.out.println();
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.size());  
        
        // System.out.println();
        
        stringArrayList.set(1, stringArrayList.get(1).toUpperCase());
        
        System.out.println();
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.size());        
        
        Collections.sort(stringArrayList);
        
        System.out.println();
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.size());  
        
        System.out.println();
        System.out.println("GAME OVER MAN");
        
    }
    
}














