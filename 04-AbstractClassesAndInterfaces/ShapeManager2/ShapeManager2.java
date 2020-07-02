import java.util.ArrayList;
import java.util.Scanner;

public class ShapeManager2 {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        int choice;
        
        while(true) {
        
            displayMenu();
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    addShape(scanner, shapes);
                    break;
                case 2:
                    removeShape(scanner, shapes);
                    break;
                case 3:
                    modifyShape(scanner, shapes);
                    break;
                case 4:
                    listShapes(shapes);
                    break;
                case 5:
                    System.out.println();
                    System.out.println("GAME OVER MAN!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.\n");
                    break;
            }

        }
        
    } 
    
    public static void displayMenu() {
        System.out.println("Please choose from the following:");
        System.out.println("\t1. Add a shape");
        System.out.println("\t2. Remove a shape");
        System.out.println("\t3. Modify a shape");
        System.out.println("\t4. List all shapes");
        System.out.println("\t5. Quit");
        System.out.println("Enter your choice:");
    }
    
    public static void addShape(Scanner scanner, ArrayList<Shape> shapes) {
        
        System.out.println();
        System.out.println("STUB CODE: addShape()");
        System.out.println();
        
    }
    
    public static void removeShape(Scanner scanner, ArrayList<Shape> shapes) {
        
        System.out.println();
        System.out.println("STUB CODE: removeShape()");
        System.out.println();
        
    }    

    public static void modifyShape(Scanner scanner, ArrayList<Shape> shapes) {
        
        System.out.println();
        System.out.println("STUB CODE: modifyShape()");
        System.out.println();
        
    }   

    public static void listShapes(ArrayList<Shape> shapes) {
        
        System.out.println();
        System.out.println("STUB CODE: listShapes()");
        System.out.println();
        
    }
    
    public static void sortShapes(Scanner scanner, ArrayList<Shape> shapes) {
        
        System.out.println();
        System.out.println("STUB CODE: sortShapes()");
        System.out.println();
        
    }

}

